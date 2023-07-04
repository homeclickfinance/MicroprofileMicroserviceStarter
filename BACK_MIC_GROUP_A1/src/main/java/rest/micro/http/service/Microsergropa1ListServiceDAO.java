/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rest.micro.http.service;


import connectio.database.Connections;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.Produces;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import micro.clas.Microsergropa1;



/**
 *
 * @author homec
 */

/*
public class Microsergropa1ListServiceDAO {
    
   // EntityManagerFactory entityManagerFactory;
    
    
    //@PersistenceContext(unitName="Backendgrupa1")
    //EntityManager entityManager;
    
       

       
    
    /*
    public Microsergropa1ListServiceDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Backendgrupa1");
        entityManager = entityManagerFactory.createEntityManager();
    }


    
    
    public void createMicroservice(Microsergropa1 microservice) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(microservice);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    */
    
    
    
    
    
    /*        START HERE 
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
                System.out.println("================================= Testing Database Connection Status =========================");

                Connection conn = Connections.getConnection();
                System.out.println("[[Your DATABASE is now connected and you can continue from here!! your conection link is]]="+conn);

                System.out.println("================================= End of Database Conection Testing  =========================");
        
        }
    
       
 
    public List<Microsergropa1> getMicrosergropa1() {
		
		return null;
	}
    
    
    
    public List<Microsergropa1> findAll() {
 
    // TODO Auto-generated method stub
               return null;
    
           }
    
    

    public void addMicrosergropa1(Microsergropa1 microservice) {
		// TODO Auto-generated method stub
                
 	
	}
    
    

    public void updateMicrosergropa1(Microsergropa1 updateMicrosergropa1) {
		// TODO Auto-generated method stub
		
	}
    
    

    public void deleteMicroserviceLIST( int microA1) {
		// TODO Auto-generated method stub
		
	}
    
    
        
        
    public void close() {
        
        entityManager.close();
        entityManagerFactory.close();
        
    }

}

    
    
*/