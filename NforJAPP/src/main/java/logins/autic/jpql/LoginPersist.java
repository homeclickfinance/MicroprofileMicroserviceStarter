/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins.autic.jpql;


import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.log.autenti.Tradeloginusers;


/**
 *
 * @author homec
 */

@Stateless
@RequestScoped
public class LoginPersist {

    /**
     * @param args the command line arguments
     */
   



   static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // TODO code application logic here
      
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("tradingappfirst");
       EntityManager em = emf.createEntityManager();
       EntityTransaction tx = em.getTransaction();
       tx.begin(); // Bigin the execution
       
       System.out.println("====================Print first Start============================");
       //The list of Object that will be perisit and entered into the database  
       Tradeloginusers tradeloginusers = new Tradeloginusers();
       tradeloginusers.setPasswords("past");
       tradeloginusers.setUsername("username");
       tradeloginusers.setFirstnames("Trad");
       tradeloginusers.setLastnames("Prot");

 
       System.out.println("====================Print Persist============================"); 
        //EXecute the Query
       em.persist(tradeloginusers);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + tradeloginusers);
         
         
        
        
       //Make the change either commit or rollback
       System.out.println("====================Print commit============================");
       em.flush(); // Flush changes to the database
       tx.commit();
       log.debug("Object is comited and - and data is save:" + tradeloginusers);
        
        
        
        
       //Close conection
       System.out.println("====================Print Close entity manager============================");
       em.close();
       emf.close(); 
   
        
    }
    
}

