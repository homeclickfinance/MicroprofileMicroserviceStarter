/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miro.host2;

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

/**
 *
 * @author homec
 */
@Entity
@Table(name = "microsergropa2", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Microsergropa2.findAll", query = "SELECT m FROM Microsergropa2 m"),
    @NamedQuery(name = "Microsergropa2.findByMicroA2", query = "SELECT m FROM Microsergropa2 m WHERE m.microA2 = :microA2"),
    @NamedQuery(name = "Microsergropa2.findByMicroservicea2", query = "SELECT m FROM Microsergropa2 m WHERE m.microservicea2 = :microservicea2")
})
public class Microsergropa2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "MicroA2", nullable = false)
    
    private Integer microA2;
    @Basic(optional = false)
    @Column(name = "Microservicea2", nullable = false, length = 60)
    private String microservicea2;

    public Microsergropa2() {
    }
    
    public Microsergropa2(String microservicea2) {
        this.microservicea2 = microservicea2;
    }

    public Microsergropa2(Integer microA2) {
        this.microA2 = microA2;
    }

    public Microsergropa2(Integer microA2, String microservicea2) {
        this.microA2 = microA2;
        this.microservicea2 = microservicea2;
    }

    public Integer getMicroA2() {
        return microA2;
    }

    public void setMicroA2(Integer microA2) {
        this.microA2 = microA2;
    }

    public String getMicroservicea2() {
        return microservicea2;
    }

    public void setMicroservicea2(String microservicea2) {
        this.microservicea2 = microservicea2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (microA2 != null ? microA2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microsergropa2)) {
            return false;
        }
        Microsergropa2 other = (Microsergropa2) object;
        if ((this.microA2 == null && other.microA2 != null) || (this.microA2 != null && !this.microA2.equals(other.microA2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Microsergropa2{" + "microA2=" + microA2 + ", microservicea2=" + microservicea2 + '}';
    }



    
}
