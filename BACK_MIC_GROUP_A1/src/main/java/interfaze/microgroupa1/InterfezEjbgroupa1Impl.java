/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.microgroupa1;

import entily.Jpa.Utiles.JpaUtil;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */


@Stateless
public class InterfezEjbgroupa1Impl implements Interfazegroupa1 {
    
   
    EntityManager em = JpaUtil.getEntityManager();
   

    @Override
    public List<Microsergropa1> findMicrosergropa1() {
        return em.createNamedQuery("Microsergropa1.findAll").getResultList();
    }

    @Override
    public List<Microsergropa1> lists() {
        return em.createQuery("SELECT m FROM Microsergropa1 m", Microsergropa1.class).getResultList();
    }

    @Override
    public Microsergropa1 findByMicroA1(Microsergropa1 microsergropa1) {
       return em.find(Microsergropa1.class, microsergropa1.getMicroA1());
    }

    @Override
    public void insertMicrosergropa1(Microsergropa1 microsergropa1) {
        em.persist(microsergropa1); 
    }

    
    @Override
    public void updateMicrosergropa1(Microsergropa1 microsergropa1) {
        em.merge(microsergropa1);
    }
    
    @Override
    public void deleteMicrosergropa1(Microsergropa1 microsergropa1) {
        em.remove(em.merge(microsergropa1));
    }

    
    
  
   
    
}
