/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micro.clas;
/*
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
*/

import java.util.Arrays;

/**
 *
 * @author homec
 */



public class Microsergropa1  {
    

    private Integer microA1;
    private String microservicea1;

    public Microsergropa1() {
    }
    
    /*
    This constructor takes a String parameter named microservicea1 and assigns its value to the microservicea1 property of the class. It allows you to create a Microsergropa1 object by providing the microservicea1 value directly in the constructor.
    */
    public Microsergropa1(String microservicea1) {
        this.microservicea1 = microservicea1;
    }

    public Integer getMicroA1() {
        return microA1;
    }

    public void setMicroA1(Integer microA1) {
        this.microA1 = microA1;
    }

    public String getMicroservicea1() {
        return microservicea1;
    }

    public void setMicroservicea1(String microservicea1) {
        this.microservicea1 = microservicea1;
    }

    @Override
    public String toString() {
        return "Microsergropa1{" + "microA1=" + microA1 + ", microservicea1=" + microservicea1 + '}';
    }

    public String displayMicrosergropa1() {
        return "Microsergropa1 [microA1=" + microA1 + ", microservicea1=" + microservicea1 + "]";
    }
}