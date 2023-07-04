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
public interface InterfezURIbuilD {
    
    public List<Microsergropa1> getMicrosergropa1();
    public List<Microsergropa1> findAll();
    public Microsergropa1 findMicrosergropa1ById(int microA1);
    public void addMicrosergropa1(Microsergropa1 microservice);
    public void updateMicrosergropa1(Microsergropa1 updateMicrosergropa1);
    public void deleteMicroserviceLIST(int microA1);
    
}
