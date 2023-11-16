/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logins.sqls;

import database.connect.Connectmysql;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.log.autenti.Tradeloginusers;

/**
 *
 * @author homec
 */

@Stateless
@RequestScoped
public class LoginEntilysql {
    
// this is where we find all class in the database 
    private static final String SQL_SELECT = "SELECT userID, passwords, username, firstnames, lastnames " + " FROM tradeloginusers";
    
   
    public List<Tradeloginusers> getlists() {  // this is the control staff use servlet control
            Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Tradeloginusers tradeloginusers = null;
            
            List<Tradeloginusers> tradeloginlisting = new ArrayList<>();
    
          try {
            connection = Connectmysql.getConnection();
            System.out.println("[[Your DATABASE is now connected and you can start your Tradeloginusers list statements Query ]]>>" + connection);
            stmt = connection.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userID");
                String passwords = rs.getString("passwords");
                String username = rs.getString("username");
                String firstnames = rs.getString("firstnames");
                String lastnames = rs.getString("lastnames");
                
                tradeloginusers = new Tradeloginusers(userID, passwords, username, firstnames, lastnames);
                tradeloginlisting.add(tradeloginusers);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(Tradeloginusers.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
            Connectmysql.close(rs);
            Connectmysql.close(stmt);
            Connectmysql.close(connection);
        }
        return tradeloginlisting;
    }

    
    
    // This is where we Find and object by an object to the database
    private static final String SQL_SELECT_BY_ID = "SELECT userID, passwords, username, firstnames, lastnames " + " FROM tradeloginusers WHERE userID = ?";
    
    public int  getusersDetailsbyID(Tradeloginusers tradeloginusers) {
        
            Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
            PreparedStatement stmt = null;
            ResultSet rs = null;
            int rows = 0; 
            
            try {      
            // open the DB connection to do Tradeloginusers like getting data or updating data here we are inserting data 
             connection = Connectmysql.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your Tradeloginusers get by Id statements Query ]]>>" + connection);
   
                               stmt = connection.prepareStatement(SQL_SELECT_BY_ID);
                               stmt.setInt(1,tradeloginusers.getUserID());
                               rs = stmt.executeQuery();
                               rs.absolute(1);//we get the register for the first register
                               
         
                              String passwords = rs.getString("passwords"); 
                              String username = rs.getString("username");
                              String firstnames = rs.getString("firstnames");
                              String lastnames = rs.getString("lastnames");
                               
                               
                              tradeloginusers.setPasswords(passwords);
                              tradeloginusers.setUsername(username);
                              tradeloginusers.setFirstnames(firstnames);
                              tradeloginusers.setLastnames(lastnames);
                               
                                                                      
    
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tradeloginusers.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connectmysql.close(rs);
            Connectmysql.close(stmt);
            Connectmysql.close(connection);
        }
       
    return rows;
    }     



//This is where we add and object to the database    
private static final String SQL_INSERT = "INSERT INTO tradeloginusers(passwords, username, firstnames, lastnames) " + " VALUES(?, ?, ?, ?, ?)";                                   

public int persistObjectusers(Tradeloginusers tradeloginusers) {
     
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0; 
    
    try {      
           // open the DB connection to do Tradeloginusers like getting data or updating data here we are inserting data 
             connection = Connectmysql.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your Tradeloginusers perisit statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_INSERT);
                        stmt.setString(1, tradeloginusers.getPasswords());	
			stmt.setString(2, tradeloginusers.getUsername());
                        stmt.setString(3, tradeloginusers.getFirstnames());
                        stmt.setString(4, tradeloginusers.getLastnames());
			rows = stmt.executeUpdate();
                        
			stmt.close();	
        }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tradeloginusers.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connectmysql.close(rs);
            Connectmysql.close(stmt);
            Connectmysql.close(connection);
        }
       
    return rows;
    }  
	   


// This is where we upgrade the database
private static final String SQL_UPDATE = "UPDATE tradeloginusers " + " SET passwords=?, username=?, firstnames=?, lastnames=? WHERE userID=?";        

public int upgradeObjectusers(Tradeloginusers tradeloginusers) {
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0;  
  
    try {      
           // open the DB connection to do Tradeloginusers like getting data or updating data here we are inserting data 
             connection = Connectmysql.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your Tradeloginusers upgarade statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_UPDATE);
                        stmt.setString(1, tradeloginusers.getPasswords());	
			stmt.setString(2, tradeloginusers.getUsername());
                        stmt.setString(3, tradeloginusers.getFirstnames());
                        stmt.setString(4, tradeloginusers.getLastnames());
                        stmt.setInt(5, tradeloginusers.getUserID());
			rows = stmt.executeUpdate();
			stmt.close();
			 		
           }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tradeloginusers.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connectmysql.close(rs);
            Connectmysql.close(stmt);
            Connectmysql.close(connection);
        }
       
    return rows;
    }  



// This is were an object is delete from the database
private static final String SQL_DELETE = "DELETE FROM tradeloginusers WHERE numbers = ?";

public int deleteObjectusers(Tradeloginusers tradeloginusers ){
     
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0; 
    
    try {      
           // open the DB connection to do Tradeloginusers like getting data or updating data here we are inserting data 
             connection = Connectmysql.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your Tradeloginusers delete statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_DELETE);
                        stmt.setInt(1, tradeloginusers.getUserID());
                        rows = stmt.executeUpdate();
			stmt.close();
			
		
             		
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            
        // Here is where the change has bin mage    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tradeloginusers.class.getName()).log(Level.SEVERE, null, ex);
        // Here is where the change has bin mage 
        
        } finally {
            Connectmysql.close(rs);
            Connectmysql.close(stmt);
            Connectmysql.close(connection);
        }
       
    return rows;
    }  
   
	   
}


