/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.log.autenti;

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
@Table(name = "tradeloginusers", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tradeloginusers.findAll", query = "SELECT t FROM Tradeloginusers t"),
    @NamedQuery(name = "Tradeloginusers.findByUserID", query = "SELECT t FROM Tradeloginusers t WHERE t.userID = :userID"),
    @NamedQuery(name = "Tradeloginusers.findByPasswords", query = "SELECT t FROM Tradeloginusers t WHERE t.passwords = :passwords"),
    @NamedQuery(name = "Tradeloginusers.findByUsername", query = "SELECT t FROM Tradeloginusers t WHERE t.username = :username"),
    @NamedQuery(name = "Tradeloginusers.findByFirstnames", query = "SELECT t FROM Tradeloginusers t WHERE t.firstnames = :firstnames"),
    @NamedQuery(name = "Tradeloginusers.findByLastnames", query = "SELECT t FROM Tradeloginusers t WHERE t.lastnames = :lastnames")})
public class Tradeloginusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "userID", nullable = false)
    private Integer userID;
    @Basic(optional = false)
    @Column(name = "passwords", nullable = false, length = 60)
    private String passwords;
    @Basic(optional = false)
    @Column(name = "username", nullable = false, length = 60)
    private String username;
    @Basic(optional = false)
    @Column(name = "firstnames", nullable = false, length = 60)
    private String firstnames;
    @Basic(optional = false)
    @Column(name = "lastnames", nullable = false, length = 60)
    private String lastnames;

    public Tradeloginusers() {
    }

    public Tradeloginusers(Integer userID) {
        this.userID = userID;
    }

    public Tradeloginusers(Integer userID, String passwords, String username, String firstnames, String lastnames) {
        this.userID = userID;
        this.passwords = passwords;
        this.username = username;
        this.firstnames = firstnames;
        this.lastnames = lastnames;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstnames() {
        return firstnames;
    }

    public void setFirstnames(String firstnames) {
        this.firstnames = firstnames;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tradeloginusers)) {
            return false;
        }
        Tradeloginusers other = (Tradeloginusers) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tradeloginusers{" + "userID=" + userID + ", passwords=" + passwords + ", username=" + username + ", firstnames=" + firstnames + ", lastnames=" + lastnames + '}';
    }


    
    public String displaytradeloginusers() {
        return "Tradeloginusers [userID=" + userID + ", passwords=" + passwords + ", username=" + username + ", firstnames=" + firstnames + ", lastnames=" + lastnames + "]";
    }
    
}
