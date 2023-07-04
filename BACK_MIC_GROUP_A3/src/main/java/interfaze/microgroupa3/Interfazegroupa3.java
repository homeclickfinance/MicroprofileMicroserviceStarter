/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaze.microgroupa3;

import jakarta.ejb.Local;
import java.util.List;
import micro.classb.Microsergropa3;

/**
 *
 * @author homec
 */

@Local
public interface Interfazegroupa3 {
    
    public List<Microsergropa3> findMicrosergropa3();
    
    public Microsergropa3 findByMicroA3(Microsergropa3 microsergropa3);
    
    public void insertMicrosergropa3(Microsergropa3 microsergropa3);
    
    public void updateMicrosergropa3(Microsergropa3 microsergropa3);
    
    public void deleteMicrosergropa3(Microsergropa3 microsergropa3);
    
}

    
