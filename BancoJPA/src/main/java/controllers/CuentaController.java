/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAOS.CuentaDAO;
import jakarta.persistence.EntityManager;
import models.Cuenta;
import utils.JpaUtil;

/**
 *
 * @author LABORATORIOS
 */
public class CuentaController {
    private final CuentaDAO cuentaDAO = new CuentaDAO();
    
    // Cuenta cuenta1, Cuenta cuenta2, long cantidad
    public void transferir(){
        EntityManager em = JpaUtil.getEntityManager();
        
        try{
            // em.getTransaction().begin();
            
            
            
            // em.getTransaction().commit();
            
        }catch(Exception e){
            e.getMessage();
        }
        
    }
    
    
    
    
}
