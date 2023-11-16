/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaze.settings;

import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import java.util.List;
import user.log.autenti.Tradeloginusers;

/**
 *
 * @author homec
 */

@Stateless
@RequestScoped
public class LoginuserImpl implements Loginuserfase {
    
    EntityManager em;

    @Override
    public List<Tradeloginusers> getTradeloginusers() {
        return em.createNamedQuery("Tradeloginusers.findAll").getResultList();
    }

    @Override
    public List<Tradeloginusers> lists() {
         return em.createQuery("SELECT t FROM Tradeloginusers t", Tradeloginusers.class).getResultList();
    }

    @Override
    public Tradeloginusers findTradeloginusersByID(Tradeloginusers tradeloginusers) {
        return em.find(Tradeloginusers.class, tradeloginusers.getUserID());
    }

    @Override
    public void insertTradeloginusers(Tradeloginusers tradeloginusers) {
        em.persist(tradeloginusers); 
    }

    @Override
    public void updateTradeloginusers(Tradeloginusers tradeloginusers) {
        em.merge(tradeloginusers); 
    }

    @Override
    public void deleteTradeloginusers(Tradeloginusers tradeloginusers) {
        em.remove(em.merge(tradeloginusers));
    }
    
    
    
}
