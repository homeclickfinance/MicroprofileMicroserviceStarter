/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins.autic.jpql;


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
public class LoginActualize {

    /**
     * @param args the command line arguments
     */
     static Logger log = LogManager.getRootLogger();
            
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
       // TODO code application logic here
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("tradingappfirst");
       EntityManager em = emf.createEntityManager();
        

       //Start the transaction
       EntityTransaction tx = em.getTransaction();
       tx.begin();

       //Exacute the SQL selection type
       System.out.println("====================Bigin to Actulize Transaction============================");
       //Find the ID the exist in the database
       System.out.println("====================Actulize first Transaction============================");
       Tradeloginusers tradeloginusers = em.find(Tradeloginusers.class,2);
                        System.out.println("=============Before Updation========");  
                        System.out.println("UserLogin id = "+ tradeloginusers.getUserID());  
         
     
       System.out.println("====================Comitted Actualized Transaction============================");
       tx.commit();
       
       //the object that was found in the database
       log.debug("Object recovered from the database:" + tradeloginusers); 

       
       //the value (SETvalue) that is set to the new (object Value) 
       System.out.println("====================Object that will be actualized============================");
       tradeloginusers.setUserID(4);
                        System.out.println("=============After Updation=========="); 
                        System.out.println("UserLogin actualize id = "+ tradeloginusers.getUserID());
       
       //The object that is modify after the change
       em.merge(tradeloginusers);


       
       System.out.println("====================List of Object that where the Transaction Actualized============================");
       //the state of the object the was modify in the database
       log.debug("Object actualize in the UserLogin databse:" + tradeloginusers);

       em.close();
       emf.close();


    }
    
}
