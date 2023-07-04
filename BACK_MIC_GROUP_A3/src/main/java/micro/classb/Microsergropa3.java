/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micro.classb;

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
@Table(name = "microsergropa3", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Microsergropa3.findAll", query = "SELECT m FROM Microsergropa3 m"),
    @NamedQuery(name = "Microsergropa3.findByMicroA3", query = "SELECT m FROM Microsergropa3 m WHERE m.microA3 = :microA3"),
    @NamedQuery(name = "Microsergropa3.findByMicroservicea3", query = "SELECT m FROM Microsergropa3 m WHERE m.microservicea3 = :microservicea3")})
public class Microsergropa3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "MicroA3", nullable = false)
    private Integer microA3;
    @Basic(optional = false)
    @Column(name = "Microservicea3", nullable = false, length = 60)
    private String microservicea3;

    public Microsergropa3() {
    }
    
    public Microsergropa3(String microservicea3) {
        this.microservicea3 = microservicea3;
    }

    public Microsergropa3(Integer microA3) {
        this.microA3 = microA3;
    }

    public Microsergropa3(Integer microA3, String microservicea3) {
        this.microA3 = microA3;
        this.microservicea3 = microservicea3;
    }

    public Integer getMicroA3() {
        return microA3;
    }

    public void setMicroA3(Integer microA3) {
        this.microA3 = microA3;
    }

    public String getMicroservicea3() {
        return microservicea3;
    }

    public void setMicroservicea3(String microservicea3) {
        this.microservicea3 = microservicea3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (microA3 != null ? microA3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microsergropa3)) {
            return false;
        }
        Microsergropa3 other = (Microsergropa3) object;
        if ((this.microA3 == null && other.microA3 != null) || (this.microA3 != null && !this.microA3.equals(other.microA3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mrcro_classb.Microsergropa3[ microA3=" + microA3 + " ]";
    }
    
}
