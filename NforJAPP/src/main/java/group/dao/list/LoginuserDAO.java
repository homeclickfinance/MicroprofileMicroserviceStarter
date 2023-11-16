/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.dao.list;

/**
 *
 * @author homec
 */


public class LoginuserDAO {
    
    private Integer userID;
    private String passwords;
    private String username;
    private String firstnames;
    private String lastnames;
    
    public LoginuserDAO(Integer userID, String passwords, String username, String firstnames, String lastnames) {
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
    
    public String displaytradeloginusers() {
        return "LoginuserDAO [userID=" + userID + ", passwords=" + passwords + ", username=" + username + ", firstnames=" + firstnames + ", lastnames=" + lastnames + "]";
    }

    @Override
    public String toString() {
        return "LoginuserDAO{" + "userID=" + userID + ", passwords=" + passwords + ", username=" + username + ", firstnames=" + firstnames + ", lastnames=" + lastnames + '}';
    }

     
        
    
}
