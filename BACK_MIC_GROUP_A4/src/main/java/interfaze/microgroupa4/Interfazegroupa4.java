/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaze.microgroupa4;

import jakarta.ejb.Local;
import java.util.List;
import micro.classd.Microsergropa4;

/**
 *
 * @author homec
 */

@Local
public interface Interfazegroupa4 {
    
     public List<Microsergropa4> findMicrosergropa4();
    
    public Microsergropa4 findByMicroA4(Microsergropa4 microsergropa4);
    
    public void insertMicrosergropa4(Microsergropa4 microsergropa4);
    
    public void updateMicrosergropa4(Microsergropa4 microsergropa4);
    
    public void deleteMicrosergropa4(Microsergropa4 microsergropa4);
    
}

    

