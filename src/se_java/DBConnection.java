/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se_java;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Rakesh
 */
public class DBConnection {
    
        Connection conn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "PCS";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root"; 
        String password = "root";
    
    public int storeInDB (String videoName,String videoDescription,String videoPath) 
    {
        
        System.out.print( "\n\nGot Here..!!\n\n" );
        try {

                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();

                String command = "CREATE TABLE IF NOT EXISTS FILE_PATHS(F_NAME VARCHAR(50) PRIMARY KEY, F_PATH VARCHAR(100), DESCRIPTION VARCHAR(100))";
                
                stmd.execute (command);

                command = command = "insert into FILE_PATHS values('"+videoName+"', '" + videoPath + "','"+videoDescription+"')" ;
                
                stmd.execute (command);

                conn.close();
                return 1;
        }
        catch(Exception e){System.out.print(e);}
        return 0;
    }  
    
    
    public Hashtable searchInDB (String searchkeyword)       
    {
        String videoName=null;
        String desc=null;
        String path=null;
        String Video[] = new String[5];
        Hashtable hash=new Hashtable();
     //   ArrayList<String> Array =new ArrayList<String>();
        
        try
        {
                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                ResultSet rs1;
                
                rs1 = stmd.executeQuery("SELECT * FROM FILE_PATHS");
                while(rs1.next())
                {
                           videoName=rs1.getString("F_NAME");
                           
                           desc=rs1.getString("DESCRIPTION");
                           path=rs1.getString("F_PATH");
                           System.out.println("key::::"+videoName);
                           System.out.println("desc::::"+desc);
                           System.out.println("path::::"+path);
                           if(desc.contains(searchkeyword)|| videoName.contains(searchkeyword))
                           {
                               String wanted=path;
                               System.out.println("-------------:"+wanted);
                               //jComboBox1.addItem(keyword);
                               hash.put(videoName, wanted);
                               //Array.add(videoName);
                           }
                           
                 }
        
               
        }
        
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            
        }
      return hash;
        
    }

    public Hashtable thumbCount() 
    {
        String path=null;
        int Count =0;
        Hashtable hash=new Hashtable();
        try {

               
                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                ResultSet rs1;
                
                rs1 = stmd.executeQuery("SELECT * FROM FILE_PATHS");
                while(rs1.next())
                {
                    path=rs1.getString("F_PATH");
                    Count++;
                    hash.put(Count, path);
                }
                
                System.out.println(Count);
                
        
               
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){System.out.print(e);}
            return hash;
        
    
    }
}
