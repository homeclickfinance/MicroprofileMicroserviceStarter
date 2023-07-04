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
public class Groupa4Persist {

    /**
     * @param args the command line arguments
     */
   



   static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // TODO code application logic here
      
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Backendgrupa4");
       EntityManager em = emf.createEntityManager();
       EntityTransaction tx = em.getTransaction();
       tx.begin(); // Bigin the execution
       
       System.out.println("====================Print first Start============================");
       //The list of Object that will be perisit and entered into the database  
       Microsergropa4 microsergropa4 = new Microsergropa4();
       microsergropa4.setMicroservicea4("pers insert");

 
       System.out.println("====================Print Persist============================"); 
        //EXecute the Query
       em.persist(microsergropa4);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + microsergropa4);
         
         
        
        
       //Make the change either commit or rollback
       System.out.println("====================Print commit============================");
       tx.commit();
       log.debug("Object is comited and - and data is save:" + microsergropa4);
        
        
        
        
       //Close conection
       System.out.println("====================Print Close entity manager============================");
       em.close();
       emf.close(); 
   
        
    }
    
}

