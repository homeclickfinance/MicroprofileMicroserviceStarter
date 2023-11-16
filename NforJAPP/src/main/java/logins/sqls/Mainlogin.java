/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins.sqls;

/**
 *
 * @author homec
 */
public class Mainlogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginEntilysql loginEntilysql = new LoginEntilysql();
        LoginsEntity  loginsEntity = new LoginsEntity();
                
        System.out.println("Data that is persisted form the tradingappfirst object" + loginEntilysql); 
        System.out.println("Data that is persisted from the tradingappfirst objects" + loginsEntity);
    }
    
}
