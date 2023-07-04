/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectio.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author homec
 */
public class ConnectionDLLstatus {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println("================================= Testing Database Connection Status =========================");
        
        Connection conn = ConectionWithDLL.getConnection();
        System.out.println("[[Your DATABASE is now connected and you can continue from here!! your conection link is]]="+conn);
        
        System.out.println("================================= End of Database Conection Testing  =========================");
    }
    
}