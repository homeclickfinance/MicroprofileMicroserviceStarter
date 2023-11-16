/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaze.settings;

import jakarta.ejb.Local;
import java.util.List;
import user.log.autenti.Tradeloginusers;

/**
 *
 * @author homec
 */

@Local 
public interface Loginuserfase {
    
    public List<Tradeloginusers> getTradeloginusers();
    
    List<Tradeloginusers> lists();
    
    public Tradeloginusers findTradeloginusersByID(Tradeloginusers tradeloginusers);
    
    public void insertTradeloginusers(Tradeloginusers tradeloginusers);
    
    public void updateTradeloginusers(Tradeloginusers tradeloginusers);
    
    public void deleteTradeloginusers(Tradeloginusers tradeloginusers);
    
}
