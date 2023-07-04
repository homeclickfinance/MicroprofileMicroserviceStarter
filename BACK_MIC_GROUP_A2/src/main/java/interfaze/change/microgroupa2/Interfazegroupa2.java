/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaze.change.microgroupa2;

import jakarta.ejb.Local;
import java.util.List;
import miro.host2.Microsergropa2;




/**
 *
 * @author homec
 */



@Local
public interface Interfazegroupa2 {
    
    public List<Microsergropa2> findMicrosergropa2();
    
    List<Microsergropa2> lists();
    
    public Microsergropa2 findByMicroA2(Microsergropa2 microsergropa2);
    
    public void insertMicrosergropa2(Microsergropa2 microsergropa2);
    
    public void updateMicrosergropa2(Microsergropa2 microsergropa2);
    
    public void deleteMicrosergropa2(Microsergropa2 microsergropa2);
    
    
    
    
    
    /*
    public List<Microsergropa1> getMicrosergropa1(Microsergropa1 microsergropa1);

    public void addMicrosergropa1(Microsergropa1 microsergropa1);
    
    public void updatesMicrosergropa1(Microsergropa1 microsergropa1);

    public void deleteMicroserviceLIST( int microA1);
    */
    

    
}

    

