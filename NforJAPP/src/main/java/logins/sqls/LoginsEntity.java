/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package logins.sqls;


import database.connect.Connectmysql;
import static entily.Jpa.Utiles.JpaUtil.getEntityManager;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import user.log.autenti.Tradeloginusers;


/**
 *
 * @author homec
 */

@Stateless
@RequestScoped
public class LoginsEntity  {

    private List<Tradeloginusers> loginlists;
    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;


    
    public LoginsEntity() {
    emf = Persistence.createEntityManagerFactory("tradingappfirst");
    em = emf.createEntityManager();
    tx = em.getTransaction(); // Add this line
    }

    public void createTradeloginusers(Tradeloginusers tradeloginusers) throws SQLException, ClassNotFoundException {
        try {
            tx.begin();
            em.persist(tradeloginusers);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Tradeloginusers> getTradeloginuser() {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        loginlists = em.createNamedQuery("Tradeloginusers.findAll", Tradeloginusers.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return loginlists;
    }

    public List<Tradeloginusers> findAll() throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        loginlists = em.createQuery("Tradeloginusers.findAll", Tradeloginusers.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return loginlists;
    }
    
    public List<Tradeloginusers> findTradeloginusersById() throws SQLException, ClassNotFoundException { // THIS IS GET ENTITY ID  int microA4
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        loginlists = em.createQuery("SELECT t FROM Tradeloginusers t WHERE t.userID = :userID", Tradeloginusers.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return loginlists;
    }
    
    
     public List<Tradeloginusers> addTradeloginusers(Tradeloginusers tradeloginusers) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Tradeloginusers tradelogin = new Tradeloginusers();
        tradelogin.setPasswords("pastword1");
        tradelogin.setUsername("my username");
        tradelogin.setFirstnames("Trader1");
        tradelogin.setLastnames("Protrade");
        em.persist(tradelogin);
        em.getTransaction().commit();
        em.close();
        return loginlists;
    }

    public List<Tradeloginusers> updateTradeloginusers(Tradeloginusers updatedTradeloginusers) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        //int id = updatedTradeloginusers.getUserID();
        Tradeloginusers tradeloginusers =em.find(Tradeloginusers.class, 1);
        tradeloginusers.setPasswords(updatedTradeloginusers.getPasswords());
        tradeloginusers.setPasswords("pastword2");
        em.merge(tradeloginusers);
        em.getTransaction().commit();
        em.close();
        
        return loginlists;
    }

    public List<Tradeloginusers> deleteTradeloginusersLIST(int userID) throws SQLException, ClassNotFoundException {
        tx.begin();
        em = getEntityManager();
        em.getTransaction().begin();
        Tradeloginusers tradeloginusers = em.find(Tradeloginusers.class, userID);
        if (tradeloginusers != null) {
            em.remove(tradeloginusers);
            em.getTransaction().commit();
        }
    
        em.close();
        return loginlists;
    }
    
    
    

    public void close() {
        em.close();
        emf.close();
        
    }
    
        
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
              System.out.println("================================= Testing Database Connection Status =========================");

              Connection conn = Connectmysql.getConnection();
              System.out.println("[[Your DATABASE is now connected and you can continue from here!! your conection link is]]="+conn);

              System.out.println("================================= End of Database Conection Testing  =========================");
        
    }

   

    
}

       




