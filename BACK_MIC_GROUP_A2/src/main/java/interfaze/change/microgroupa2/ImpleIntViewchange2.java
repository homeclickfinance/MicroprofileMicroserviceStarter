/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.change.microgroupa2;

import static entily.Jpa.Utiles.JpaUtil.getEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;
import java.util.List;
import miro.host2.Microsergropa2;




/**
 *
 * @author homec
 */
public class ImpleIntViewchange2 {
    
    
    private List<Microsergropa2> listEvents;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;
    
    /*@Inject
    private InterfezEjbgroupa2Impl interfezEjbgroupa2Impl;*/
    
    public ImpleIntViewchange2() {
    emf = Persistence.createEntityManagerFactory("Backendgrupa2");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createMicroservice(Microsergropa2 microservice2) {
        try {
            tx.begin();
            em.persist(microservice2);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Microsergropa2> getMicrosergropa2() throws SQLException, ClassNotFoundException {
        
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createNamedQuery("Microsergropa2.findAll", Microsergropa2.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
        

    }

    public List<Microsergropa2> findAll() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("SELECT m FROM Microsergropa2 m", Microsergropa2.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa2> findMicrosergropa2ById() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = em.createQuery("Microsergropa2.findByMicroA2", Microsergropa2.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listEvents;
        /*
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        listEvents = singletonList(em.find(Microsergropa2.class, microA2));
        em.getTransaction().commit();
        em.close();
        return listEvents.get(0);
        */
    }

    public List<Microsergropa2> addMicrosergropa2(Microsergropa2 microservice2) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa2 event = new Microsergropa2();
        event.setMicroservicea2("Third service");
        em.persist(event);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa2> updateMicrosergropa2(Microsergropa2 updatedMicrosergropa2) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        int id = updatedMicrosergropa2.getMicroA2();
        Microsergropa2 microservice2 =em.find(Microsergropa2.class, id);
        microservice2.setMicroservicea2(updatedMicrosergropa2.getMicroservicea2());
        //event.setMicroservicea2("Third service E");
        em.merge(microservice2);
        em.getTransaction().commit();
        em.close();
        return listEvents;
    }

    public List<Microsergropa2> deleteMicroserviceLIST2(int microA2) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Microsergropa2 microservice2 = em.find(Microsergropa2.class, microA2);
        if (microservice2 != null) {
            em.remove(microservice2);
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

       





    

