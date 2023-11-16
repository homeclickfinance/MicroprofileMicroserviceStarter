/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins.autic.jpql;

import interfaze.settings.Loginuserfase;
import jakarta.inject.Inject;
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
public class Loginfind {

    /**
     * @param args the command line arguments
     */
    

   static Logger log = LogManager.getRootLogger();
    
   @Inject        
   Loginuserfase loginuserfase; // Declare the interface and inject it and import its package
     
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tradingappfirst");
        EntityManager em = emf.createEntityManager();

        //Start the transcation
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        
        //The list of objects to search for
        System.out.println("====================Print first Searching for Transaction============================");
        Tradeloginusers tradeloginusers = em.find(Tradeloginusers.class, 1);
        
        //Finish the committed objects
        System.out.println("====================Searching oject Commited============================");
        tx.commit();
       
        //The state of the commited object
        System.out.println("====================Print LogDebug of Objects commited============================");
        log.debug("We are found the following object:" + tradeloginusers);
        
        //The entity manager is close
        em.close();
        emf.close();
       

    }
}
