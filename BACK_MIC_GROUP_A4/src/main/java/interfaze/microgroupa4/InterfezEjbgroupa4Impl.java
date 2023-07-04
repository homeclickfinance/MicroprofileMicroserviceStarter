/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.microgroupa4;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;
import micro.classd.Microsergropa4;

/**
 *
 * @author homec
 */

@Stateless
public class InterfezEjbgroupa4Impl implements Interfazegroupa4{
    
    
    
    
   EntityManager em;

    @Override
    public List<Microsergropa4> findMicrosergropa4() {
        return em.createNamedQuery("Microsergropa4.findAll").getResultList();
    }


    @Override
    public Microsergropa4 findByMicroA4(Microsergropa4 microsergropa4) {
       return em.find(Microsergropa4.class, microsergropa4.getMicroA4());
    }

    @Override
    public void insertMicrosergropa4(Microsergropa4 microsergropa4) {
        em.persist(microsergropa4); 
    }

    @Override
    public void updateMicrosergropa4(Microsergropa4 microsergropa4) {
        em.merge(microsergropa4);
    }

    @Override
    public void deleteMicrosergropa4(Microsergropa4 microsergropa4) {
        em.remove(em.merge(microsergropa4));
    }
    
    
}
