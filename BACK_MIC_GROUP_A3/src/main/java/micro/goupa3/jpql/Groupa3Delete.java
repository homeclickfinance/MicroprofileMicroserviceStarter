/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package micro.goupa3.jpql;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import micro.classb.Microsergropa3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */
public class Groupa3Delete {

    /**
     * @param args the command line arguments
     */
    
     static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Backendgrupa3");
        EntityManager em = emf.createEntityManager();

        //Starting of the transaction
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Execute SQL type selected 
        System.out.println("====================Print first Start delete============================");
        Microsergropa3 microsergropa3 = em.find(Microsergropa3.class,2);
        
        
        // the state of the object detached
        log.debug("object found is:" + microsergropa3);
        
        //The Sql is remove and deleted
        System.out.println("====================Romove starting============================");
        em.remove(em.merge(microsergropa3));  // interfase that Can be use to merge or delete data from the database
        
        //Terminate transaction
        System.out.println("====================Delete Transcation commited============================");
        tx.commit();
        
         
        //the object is commit and eliminated
        System.out.println("====================Print Debug Delete Transactions============================");
        log.debug("the state of the object is complete:" + microsergropa3);
        
        //Transcation is closed
        System.out.println("====================Closing transcation finished============================");
        em.close();
        emf.close();
    }
    
}
