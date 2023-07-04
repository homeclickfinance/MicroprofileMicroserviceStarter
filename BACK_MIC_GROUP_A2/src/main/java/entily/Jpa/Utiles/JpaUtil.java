/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entily.Jpa.Utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author homec
 */
public class JpaUtil {
    
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
    
    
    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("Backendgrupa2");
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    
    
}

    

