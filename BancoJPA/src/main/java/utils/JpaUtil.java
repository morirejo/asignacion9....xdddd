/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author LABORATORIOS
 */
public class JpaUtil {
    private static final String PERSITENCE_UNIT = "BancoPU";
    private static EntityManagerFactory emf;
    
        
    public static EntityManager getEntityManager(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PERSITENCE_UNIT);
        }
        
        return emf.createEntityManager();
    }
    
    
    
    
    
    
}
