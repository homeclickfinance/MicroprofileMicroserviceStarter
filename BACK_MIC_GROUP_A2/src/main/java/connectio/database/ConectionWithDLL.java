/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author homec
 */
public class ConectionWithDLL {
    
      public static Connection getConnection() throws SQLException, ClassNotFoundException {
          
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:1986/";
        String dbName = "Backendgrupa1";
        String dbUsername = "root";
        String dbPassword = "town337cry954";
        Connection con = null;
        
            try{
        Class.forName(dbDriver);
                con =DriverManager.getConnection(dbURL+ dbName+"?" + "user="+dbUsername+"&password="+dbPassword+"&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false");
            }catch(Exception e ){
                System.out.println("Exception while getting connnetion");
                e.printStackTrace();
            }

        return con;
    }


    
}
