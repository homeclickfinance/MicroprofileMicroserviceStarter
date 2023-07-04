/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.microgroupa4;

import connectio.database.Connections;
import static entily.Jpa.Utiles.JpaUtil.getEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.Connection;
import java.sql.SQLException;
import static java.util.Collections.singletonList;
import java.util.List;
import micro.classd.Microsergropa4;

/**
 *
 * @author homec
 */
public class ImpleIntView4 {
    
   
        
   
    private List<Microsergropa4> listEvents;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;


    
    public ImpleIntView4() {
    emf = Persistence.createEntityManagerFactory("Backendgrupa4");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createMicroservice(Microsergropa4 microservice4) {
        try {
            tx.begin();
            em.persist(microservice4);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    


    public List<Microsergropa4> getMicrosergropa4() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createNamedQuery("Microsergropa4.findAll", Microsergropa4.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa4> findAll() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa4 m", Microsergropa4.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa4> findMicrosergropa1ById() throws SQLException, ClassNotFoundException { // THIS IS GET ENTITY ID  int microA4
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("Microsergropa4.findByMicroA4", Microsergropa4.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa4> addMicrosergropa4(Microsergropa4 microservice4) throws SQLException, ClassNotFoundException {  //THIS IS TO ADD
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 event = new Microsergropa4();
        event.setMicroservicea4("Insert onehundred");
        em.persist(event);
        em.getTransaction().commit();
        em.close();
        System.out.println("[[Your DATABASE is now connected and you can continue from here!! your conection link is]]="+event);
        return listEvents;
    }
    
    /*
    public List<Microsergropa4> updateMicrosergropa4(Microsergropa4 updatedMicrosergropa4) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 microservice4 = new Microsergropa4();
        listEvents = em.createQuery("UPDATE microsergropa4 " + " SET microservicea4=? WHERE microA4=?").getResultList();
        //microservice4.setMicroservicea4(updatedMicrosergropa4.getMicroservicea4());
        microservice4.setMicroservicea4("putting");
        em.merge(microservice4);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }*/
   
    
    
public List<Microsergropa4> updateMicrosergropa4(Microsergropa4 updatedMicrosergropa4) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        int id = updatedMicrosergropa4.getMicroA4();
        Microsergropa4 microservice4 =em.find(Microsergropa4.class, id);
        microservice4.setMicroservicea4(updatedMicrosergropa4.getMicroservicea4());
        //microservice4.setMicroservicea4("fd");
       
        em.merge(microservice4);
        em.getTransaction().commit();
        em.close();
       
        return listEvents;
    }
    
    
    
    public List<Microsergropa4> deleteMicroserviceLIST4(int microA4) throws SQLException, ClassNotFoundException { //This is OK
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 microservice4 = em.find(Microsergropa4.class, microA4);
        if (microservice4 != null) {
            em.remove(microservice4);
            em.getTransaction().commit();
        }
        em.close();
        System.out.println("[[Your DATABASE is now connected and you can continue from here!! your conection link is]]="+microA4);
        return listEvents;
    }
    
    
    

    public void close() {
        em.close();
        emf.close();
        
    }
   

    
}

     
/*

public class ImpleIntView4 {
    
    
    private List<Microsergropa4> listEvents;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;


    
    public ImpleIntView4() {
    emf = Persistence.createEntityManagerFactory("Backendgrupa4");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createMicroservice(Microsergropa4 microservice4) {
        try {
            tx.begin();
            em.persist(microservice4);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Microsergropa4> getMicrosergropa4() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createNamedQuery("Microsergropa4.findAll", Microsergropa4.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa4> findAll() {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa4 m", Microsergropa4.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    protected Microsergropa4 findMicrosergropa1ById(int microA4) {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = singletonList(em.find(Microsergropa4.class, microA4));
        em.getTransaction().commit();
        em.close();
        return listEvents.get(0);
    }

    public void addMicrosergropa4(Microsergropa4 microservice4) {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 event = new Microsergropa4();
        event.setMicroservicea4(microservice4.getMicroservicea4());
        event.setMicroservicea4("Third service");
        em.persist(event);
        em.getTransaction().commit();
        em.close();
    }

    public void updateMicrosergropa4(Microsergropa4 updateMicrosergropa4) {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 event = new Microsergropa4();
        event.setMicroservicea4(updateMicrosergropa4.getMicroservicea4());
        event.setMicroservicea4("Third service E");
        em.merge(event);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteMicroserviceLIST4(int microA4) {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa4 microservice4 = em.find(Microsergropa4.class, microA4);
        if (microservice4 != null) {
            em.remove(microservice4);
            em.getTransaction().commit();
        }
        em.close();
    }
    
    
    

    public void close() {
        em.close();
        emf.close();
        
    }
   

    
}

       





    


*/




    

