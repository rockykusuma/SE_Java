/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se_java;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Rakesh
 */
public class DBConnection {
    public int storeInDB (String videoName,String videoDescription,String videoPath) 
    {
        
        System.out.print( "\n\nGot Here..!!\n\n" );
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "PCS";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root"; 
        String password = "root";

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
    
    public String searchInDB (String Note)       
    {
        
        
        
        
        
        
        return null;
        
        
    }
    
    
}
