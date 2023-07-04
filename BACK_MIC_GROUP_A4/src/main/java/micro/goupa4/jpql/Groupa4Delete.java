/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package micro.goupa4.jpql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import micro.classd.Microsergropa4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */
public class Groupa4Delete {

    /**
     * @param args the command line arguments
     */
    
     static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Backendgrupa4");
        EntityManager em = emf.createEntityManager();

        //Starting of the transaction
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Execute SQL type selected 
        System.out.println("====================Print first Start delete============================");
        Microsergropa4 microsergropa4 = em.find(Microsergropa4.class,1);
        
        
        // the state of the object detached
        log.debug("object found is:" + microsergropa4);
        
        //The Sql is remove and deleted
        System.out.println("====================Romove starting============================");
        em.remove(em.merge(microsergropa4));  // interfase that Can be use to merge or delete data from the database
        
        //Terminate transaction
        System.out.println("====================Delete Transcation commited============================");
        tx.commit();
        
         
        //the object is commit and eliminated
        System.out.println("====================Print Debug Delete Transactions============================");
        log.debug("the state of the object is complete:" + microsergropa4);
        
        //Transcation is closed
        System.out.println("====================Closing transcation finished============================");
        em.close();
        emf.close();
    }
    
}
