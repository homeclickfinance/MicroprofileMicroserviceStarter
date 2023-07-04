/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.microgroupa3;

import static entily.Jpa.Utiles.JpaUtil.getEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import static java.util.Collections.singletonList;
import java.util.List;
import micro.classb.Microsergropa3;

/**
 *
 * @author homec
 */
public class ImpleIntView3 {
    
    
    private List<Microsergropa3> listEvents;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;


    
    public ImpleIntView3() {
    emf = Persistence.createEntityManagerFactory("Backendgrupa3");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createMicroservice(Microsergropa3 microservice3) {
        try {
            tx.begin();
            em.persist(microservice3);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Microsergropa3> getMicrosergropa3() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createNamedQuery("Microsergropa3.findAll", Microsergropa3.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa3> findAll() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa3 m", Microsergropa3.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }
    /*
    protected Microsergropa3 findMicrosergropa1ById(int microA3) {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = singletonList(em.find(Microsergropa3.class, microA3));
        em.getTransaction().commit();
        em.close();
        return listEvents.get(0);
    }
    */
    public List<Microsergropa3> addMicrosergropa3(Microsergropa3 microservice3) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa3 event = new Microsergropa3();
        event.setMicroservicea3("Third service D");
        em.persist(event);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa3> updateMicrosergropa3(Microsergropa3 updatedMicrosergropa3) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        int id = updatedMicrosergropa3.getMicroA3();
        Microsergropa3 microservice3 =em.find(Microsergropa3.class, id);
        microservice3.setMicroservicea3(updatedMicrosergropa3.getMicroservicea3());
        em.merge(microservice3);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa3> deleteMicroserviceLIST3(int microA3) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa3 microservice = em.find(Microsergropa3.class, microA3);
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

       





    

