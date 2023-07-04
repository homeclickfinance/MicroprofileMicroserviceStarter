/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author homec
 */
public class Connections {
    
private static final String JDBC_URL = "jdbc:mysql://localhost:1986?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "town337cry954";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
       

        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
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
        

