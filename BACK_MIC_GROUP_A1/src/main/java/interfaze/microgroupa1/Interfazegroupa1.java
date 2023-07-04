/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaze.microgroupa1;

import jakarta.ejb.Local;
import java.util.List;
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */



@Local
public interface Interfazegroupa1 {
    
    public List<Microsergropa1> findMicrosergropa1();
    
    List<Microsergropa1> lists();
    
    public Microsergropa1 findByMicroA1(Microsergropa1 microsergropa1);
    
    public void insertMicrosergropa1(Microsergropa1 microsergropa1);
    
    public void updateMicrosergropa1(Microsergropa1 microsergropa1);
    
    public void deleteMicrosergropa1(Microsergropa1 microsergropa1);
    
    
    
    
    
    /*
    public List<Microsergropa1> getMicrosergropa1(Microsergropa1 microsergropa1);

    public void addMicrosergropa1(Microsergropa1 microsergropa1);
    
    public void updatesMicrosergropa1(Microsergropa1 microsergropa1);

    public void deleteMicroserviceLIST( int microA1);
    */
    

    
}

    

