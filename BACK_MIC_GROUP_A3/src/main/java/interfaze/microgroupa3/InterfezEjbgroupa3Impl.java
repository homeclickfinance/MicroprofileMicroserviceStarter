/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.microgroupa3;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;
import micro.classb.Microsergropa3;

/**
 *
 * @author homec
 */

@Stateless
public class InterfezEjbgroupa3Impl implements Interfazegroupa3{
    
   
    EntityManager em;

    @Override
    public List<Microsergropa3> findMicrosergropa3() {
        return em.createNamedQuery("Microsergropa3.findAll").getResultList();
    }


    @Override
    public Microsergropa3 findByMicroA3(Microsergropa3 microsergropa3) {
       return em.find(Microsergropa3.class, microsergropa3.getMicroA3());
    }

    @Override
    public void insertMicrosergropa3(Microsergropa3 microsergropa3) {
        em.persist(microsergropa3); 
    }

    @Override
    public void updateMicrosergropa3(Microsergropa3 microsergropa3) {
        em.merge(microsergropa3);
    }

    @Override
    public void deleteMicrosergropa3(Microsergropa3 microsergropa3) {
        em.remove(em.merge(microsergropa3));
    }
    
    
    
}
    

