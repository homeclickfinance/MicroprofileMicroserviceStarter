/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package micro.clas;

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

@Entity
@Table(name = "microsergropa1")
@NamedQueries({
    @NamedQuery(name = "Microsergropa1.findAll", query = "SELECT m FROM Microsergropa1 m"),
    @NamedQuery(name = "Microsergropa1.findByMicroA1", query = "SELECT m FROM Microsergropa1 m WHERE m.microA1 = :microA1"),
    @NamedQuery(name = "Microsergropa1.findByMicroservicea1", query = "SELECT m FROM Microsergropa1 m WHERE m.microservicea1 = :microservicea1")
})
public class Microsergropa1 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "MicroA1", nullable = false)
    private Integer microA1;

    @Basic(optional = false)
    @Column(name = "Microservicea1", nullable = false, length = 60)
    private String microservicea1;

    public Microsergropa1() {
    }

    public Microsergropa1(Integer microA1) {
        this.microA1 = microA1;
    }

    public Microsergropa1(String microservicea1) {
        this.microservicea1 = microservicea1;
    }

    public Microsergropa1(Integer microA1, String microservicea1) {
        this.microA1 = microA1;
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
    public int hashCode() {
        int hash = 0;
        hash += (microA1 != null ? microA1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Microsergropa1)) {
            return false;
        }
        Microsergropa1 other = (Microsergropa1) object;
        if ((this.microA1 == null && other.microA1 != null) || (this.microA1 != null && !this.microA1.equals(other.microA1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Microsergropa1{" + "microA1=" + microA1 + ", microservicea1=" + microservicea1 + '}';
    }
    
    public String displayMicrosergropa1() {
		return "Microsergropa1 [microA1=" + microA1+ ", microservicea1=" +microservicea1+"]";
	}
}



