/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se_java;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakesh
 */
public class DBConnection {
    
        Connection conn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "PCS";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "rakesh"; 
        String password = "rakesh";
        
       
     public  boolean DBConnection()
     {
        
        try{
            System.out.println("kjsgfkja");            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                   
               Connection conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                stmd.execute ("select 1 from dual");
            System.out.println("kjsgfkja");    

            }
            catch(Exception e)
            {

                return false;
            }
        return true;
    }
    
    public int storeInDB (String videoName,String videoDescription,String videoPath,String imagePath) 
    {
        
        System.out.print( "\n\nGot Here..!!\n\n" );
        try 
        {

                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
             
                FileInputStream fin = new FileInputStream(imagePath);
                String command = "CREATE TABLE IF NOT EXISTS FILE_PATHS(F_NAME VARCHAR(50) PRIMARY KEY, F_PATH VARCHAR(100), DESCRIPTION VARCHAR(100), IMAGE BLOB)";
                
                stmd.execute (command);

                command = command = "insert into FILE_PATHS values('"+videoName+"', '" + videoPath + "','"+videoDescription+"','"+fin+"')" ;
                
               
		

		//int result = stmd.executeUpdate();
		//System.out.println(result + " Record Successfully Inserted");

                
                stmd.execute (command);

                conn.close();
                return 1;
        }
        catch(Exception e){
        
        }
        return 0;
    }  
    
    
    public Hashtable searchInDB (String searchkeyword)       
    {
        String videoName=null;
        String desc=null;
        String path=null;
        String Video[] = new String[5];
        Hashtable hash=new Hashtable();
        int Count =0;
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
                           if(desc.contains(searchkeyword)|| videoName.equalsIgnoreCase(searchkeyword))
                           {
                               //String wanted=path;
                               Count++;
                               System.out.println("-------------:"+path);
                               hash.put(Count, path);
                           }
                           
                 }
                     
        }
        
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            
        }
        System.out.println("qwewrwrwrqwrqw" + hash.size());
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

    public void StoreinForum(String discussionString) throws  SQLException, ClassNotFoundException 
    {
        String Array[] = discussionString.split("*");
        
        
          try {
                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                
                
               String command = "CREATE TABLE IF NOT EXISTS DISCFORUM(U_NAME VARCHAR(50), POST VARCHAR(200), V_NAME VARCHAR(100), DATE VARCHAR(100))";
                
                stmd.execute (command);

                command = command = "INSERT INTO DISCFORUM VALUES('"+Array[0]+"', '" + Array[1] + "','"+Array[2]+"','"+Array[3]+"')" ;

                
                stmd.execute (command);

                conn.close();
                
    }
    
    catch (    InstantiationException | IllegalAccessException ex) 
    {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }

    public String searchInForum() throws ClassNotFoundException, SQLException {
            try {
                        Class.forName(driver).newInstance();                          
                        conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);
                        Statement stmd = (Statement) conn.createStatement();                       
                        ResultSet rs1;                        
                        rs1 = stmd.executeQuery("SELECT * FROM forum");
                        String Global="";
                        while(rs1.next())
                        {
                             Global = Global+"\n"+rs1.getString("ForumData");
                             
                        }
                
            return Global;
            } catch (    InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
       
    }

    byte[] GetImage(String imghash) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        Class.forName(driver).newInstance();                          
                        conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);
                        Statement stmd = (Statement) conn.createStatement();
                        ResultSet rs = stmd.executeQuery( "select image from file_paths where f_path='imghash'") ;
                        if(rs.next())
                        {
            System.out.println("BLOB");
                       
                                Blob b= rs.getBlob("image");
                                 int blobLength = (int) b.length();

           byte[] imagdata = b.getBytes(1, blobLength);

                         
                        
                        return imagdata;
                        }
            return null;

        
    }

    public void DiscussionForum(String uName, String Post, String VName, String date) throws ClassNotFoundException, SQLException {
       
    
    try {
                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                
                
               String command = "CREATE TABLE IF NOT EXISTS DISCFORUM(U_NAME VARCHAR(50), POST VARCHAR(200), V_NAME VARCHAR(100), DATE VARCHAR(100))";
                
                stmd.execute (command);

                command = command = "INSERT INTO DISCFORUM VALUES('"+uName+"', '" + Post + "','"+VName+"','"+date+"')" ;

                
                stmd.execute (command);

                conn.close();
                
    }
    
    catch (    InstantiationException | IllegalAccessException ex) 
    {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }
    
    
  public void Comment(String uName, String Comment, String VName, String date) throws ClassNotFoundException, SQLException {
       
    
    try {
                Class.forName(driver).newInstance();
                   
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                
                
               String command = "CREATE TABLE IF NOT EXISTS COMMENT(U_NAME VARCHAR(50), COMMENT VARCHAR(200), V_NAME VARCHAR(100), DATE VARCHAR(100))";
                
                stmd.execute (command);

                command = command = "INSERT INTO DISCFORUM VALUES('"+uName+"', '" + Comment + "','"+VName+"','"+date+"')" ;

                
                stmd.execute (command);

                conn.close();
                
    }
    
    catch (    InstantiationException | IllegalAccessException ex) 
    {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }

 public int loginVerification(String login, String pwd) 
    {
        System.out.println("Login---");
        String path=null;
        try{
                Class.forName(driver).newInstance();
                System.out.println("Testing 2");
                conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);

                Statement stmd = (Statement) conn.createStatement();
                
                ResultSet rs1;
              
                rs1 = stmd.executeQuery("SELECT * FROM REGISTRATION");
                  System.out.println("Testing abcd");
                ArrayList db_username=new ArrayList();
                ArrayList db_password=new ArrayList();
                while(rs1.next())
                {
                    System.out.println("Testing 3");
                    db_username.add(rs1.getString("uname"));
                    db_password.add(rs1.getString("pwd"));

                }
        System.out.println(login+pwd);
        if (db_username.contains(login))
        {
            //System.out.println("login found");
            int a= db_username.indexOf(login);
            //System.out.println(a);
            //System.out.println(db_password.get(a));
            if (db_password.get(a).equals(pwd))
            {
                //System.out.println("Login Successful");
                return 0;
               // HomePage.main();
                
            }
            else
            {
                //password didn't match Username
                //JOptionPane.showMessageDialog(null,"Password didn't match with username");
                
                return 3;
            }
        }
        else
        {
            //Username not found in database
//            JOptionPane.showMessageDialog(null,"Username not found.");
            return 2;
        }
        }
        catch(Exception e)
        {
            
        }
            return 4;
    }
}
