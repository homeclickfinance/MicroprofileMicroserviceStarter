/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.change.microgroupa2;

import entily.Jpa.Utiles.JpaUtil;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;
import miro.host2.Microsergropa2;



/**
 *
 * @author homec
 */


@Stateless
public class InterfezEjbgroupa2Impl implements Interfazegroupa2 {
    
  
   
    EntityManager em = JpaUtil.getEntityManager();
   

    @Override
    public List<Microsergropa2> findMicrosergropa2() {
        return em.createNamedQuery("Microsergropa2.findAll").getResultList();
    }

    @Override
    public List<Microsergropa2> lists() {
        return em.createQuery("SELECT m FROM Microsergropa2 m", Microsergropa2.class).getResultList();
    }

    @Override
    public Microsergropa2 findByMicroA2(Microsergropa2 microsergropa2) {
       return em.find(Microsergropa2.class, microsergropa2.getMicroA2());
    }

    @Override
    public void insertMicrosergropa2(Microsergropa2 microsergropa2) {
        em.persist(microsergropa2); 
    }

    
    @Override
    public void updateMicrosergropa2(Microsergropa2 microsergropa2) {
        em.merge(microsergropa2);
    }
    
    @Override
    public void deleteMicrosergropa2(Microsergropa2 microsergropa2) {
        em.remove(em.merge(microsergropa2));
    }

    
    
  
   
    
}
