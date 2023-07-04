/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package interfaze.microgroupa1;

import connectio.database.Connections;
import static entily.Jpa.Utiles.JpaUtil.getEntityManager;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import static java.util.Collections.singletonList;
import java.util.List;
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */

public class MicroIntImpEntityMang {

    private List<Microsergropa1> listEvents;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;


    
    public MicroIntImpEntityMang() {
    emf = Persistence.createEntityManagerFactory("Backendgrupa1");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createMicroservice(Microsergropa1 microservice) throws SQLException, ClassNotFoundException {
        try {
            tx.begin();
            em.persist(microservice);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Microsergropa1> getMicrosergropa1() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createNamedQuery("Microsergropa1.findAll", Microsergropa1.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa1> findAll() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa1 m", Microsergropa1.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }
    
    public List<Microsergropa1> findMicrosergropa1ById(int microA1) throws SQLException, ClassNotFoundException { // THIS IS GET ENTITY ID  int microA4
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa1 m", Microsergropa1.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }
    
    
     public List<Microsergropa1> addMicrosergropa1(Microsergropa1 microservice) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa1 event = new Microsergropa1();
        event.setMicroservicea1("Third serviceddf");
        em.persist(event);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa1> updateMicrosergropa1(Microsergropa1 updatedMicrosergropa1) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        int id = updatedMicrosergropa1.getMicroA1();
        Microsergropa1 microservice1 =em.find(Microsergropa1.class, id);
        microservice1.setMicroservicea1(updatedMicrosergropa1.getMicroservicea1());
        //event.setMicroservicea1(updateMicrosergropa1.getMicroservicea1());
        //event.setMicroservicea1("Third service");
        em.merge(microservice1);
        em.getTransaction().commit();
        em.close();
        
        return listEvents;
    }

    public List<Microsergropa1> deleteMicroserviceLIST(int microA1) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa1 microservice = em.find(Microsergropa1.class, microA1);
        if (microservice != null) {
            em.remove(microservice);
            em.getTransaction().commit();
        }
    
        em.close();
        return listEvents;
    }
    
    
    

    public void close() {
        em.close();
        emf.close();
        
    }
   

    
}

       




