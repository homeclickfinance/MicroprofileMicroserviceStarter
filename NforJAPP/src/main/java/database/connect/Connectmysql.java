/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author homec
 */
public class Connectmysql {
    
          
 public static Connection getConnection() throws SQLException, ClassNotFoundException {
          
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:1986/";
        String dbName = "tradingappfirst";
        String dbUsername = "root";
        String dbPassword = "town337cry954";
        Connection con = null;
        
            try{
        Class.forName(dbDriver);
                con =DriverManager.getConnection(dbURL+ dbName+"?" + "user="+dbUsername+"&password="+dbPassword+"&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false");
            }catch(Exception e ){
                Logger.getLogger(Connectmysql.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("Exception while getting connnetion");
                e.printStackTrace();
            }

        return con;
    }
 
    public static void close(ResultSet rs){
         
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }


    
}
