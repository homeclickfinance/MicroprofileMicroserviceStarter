/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micro.classd;

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
@Table(name = "microsergropa4", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Microsergropa4.findAll", query = "SELECT m FROM Microsergropa4 m"),
    @NamedQuery(name = "Microsergropa4.findByMicroA4", query = "SELECT m FROM Microsergropa4 m WHERE m.microA4 = :microA4"),
    @NamedQuery(name = "Microsergropa4.findByMicroservicea4", query = "SELECT m FROM Microsergropa4 m WHERE m.microservicea4 = :microservicea4")})
public class Microsergropa4 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "MicroA4", nullable = false)
    private Integer microA4;
    @Basic(optional = false)
    @Column(name = "Microservicea4", nullable = false, length = 60)
    private String microservicea4;

    public Microsergropa4() {
    }
    
    public Microsergropa4(String microservicea4) {
        this.microservicea4 = microservicea4;
    }

    public Microsergropa4(Integer microA4) {
        this.microA4 = microA4;
    }

    public Microsergropa4(Integer microA4, String microservicea4) {
        this.microA4 = microA4;
        this.microservicea4 = microservicea4;
    }

    public Integer getMicroA4() {
        return microA4;
    }

    public void setMicroA4(Integer microA4) {
        this.microA4 = microA4;
    }

    public String getMicroservicea4() {
        return microservicea4;
    }

    public void setMicroservicea4(String microservicea4) {
        this.microservicea4 = microservicea4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (microA4 != null ? microA4.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Microsergropa4)) {
            return false;
        }
        Microsergropa4 other = (Microsergropa4) object;
        if ((this.microA4 == null && other.microA4 != null) || (this.microA4 != null && !this.microA4.equals(other.microA4))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "micro_classd.Microsergropa4[ microA4=" + microA4 + " ]";
    }
    
}
