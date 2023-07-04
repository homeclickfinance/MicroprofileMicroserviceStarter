/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package micro.goupa1.jpql;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import micro.clas.Microsergropa1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */



public class Groupa1Actualize {

    /**
     * @param args the command line arguments
     */

   
    static Logger log = LogManager.getRootLogger();
            
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
       // TODO code application logic here
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Backendgrupa1");
       EntityManager em = emf.createEntityManager();
        

       //Start the transaction
       EntityTransaction tx = em.getTransaction();
       tx.begin();

       //Exacute the SQL selection type
       System.out.println("====================Bigin to Actulize Transaction============================");
       //Find the ID the exist in the database
       System.out.println("====================Actulize first Transaction============================");
       Microsergropa1 microsergropa1 = em.find(Microsergropa1.class,3);
                        System.out.println("=============Before Updation========");  
                        System.out.println("Microservice id = "+ microsergropa1.getMicroA1());  
         
     
       System.out.println("====================Comitted Actualized Transaction============================");
       tx.commit();
       
       //the object that was found in the database
       log.debug("Object recovered from the database:" + microsergropa1); 

       
       //the value (SETvalue) that is set to the new (object Value) 
       System.out.println("====================Object that will be actualized============================");
       microsergropa1.setMicroA1(4);
                        System.out.println("=============After Updation=========="); 
                        System.out.println("Microservice actualize id = "+ microsergropa1.getMicroA1());
       
       //The object that is modify after the change
       em.merge(microsergropa1);


       
       System.out.println("====================List of Object that where the Transaction Actualized============================");
       //the state of the object the was modify in the database
       log.debug("Object actualize in the Microservice databse:" + microsergropa1);

       em.close();
       emf.close();


    }
    
}
