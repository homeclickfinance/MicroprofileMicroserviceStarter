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
public class Groupa3Persist {

    /**
     * @param args the command line arguments
     */
   

    

   static Logger log = LogManager.getRootLogger();
    
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // TODO code application logic here
      
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Backendgrupa3");
       EntityManager em = emf.createEntityManager();
       EntityTransaction tx = em.getTransaction();
       tx.begin(); // Bigin the execution
       
       System.out.println("====================Print first Start============================");
       //The list of Object that will be perisit and entered into the database  
       Microsergropa3 microsergropa3 = new Microsergropa3();
       microsergropa3.setMicroservicea3("per insert");

 
       System.out.println("====================Print Persist============================"); 
        //EXecute the Query
       em.persist(microsergropa3);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + microsergropa3);
         
         
        
        
       //Make the change either commit or rollback
       System.out.println("====================Print commit============================");
       tx.commit();
       log.debug("Object is comited and - and data is save:" + microsergropa3);
        
        
        
        
       //Close conection
       System.out.println("====================Print Close entity manager============================");
       em.close();
       emf.close(); 
   
        
    }
    
}


