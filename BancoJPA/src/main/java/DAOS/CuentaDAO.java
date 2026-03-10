/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import jakarta.persistence.EntityManager;
import java.util.List;
import models.Cuenta;

/**
 *
 * @author LABORATORIOS
 */
public class CuentaDAO implements ICuentaDAO{

    @Override
    public void guardar(EntityManager em, Cuenta cuenta) {
        em.persist(cuenta);
        
    }

    @Override
    public Cuenta buscar(EntityManager em, Long id) {
        return em.find(Cuenta.class, id);
        
    }

    @Override
    public List<Cuenta> buscarTodas(EntityManager em) {
        return em.createQuery("select c from Cuenta", Cuenta.class).getResultList();
        
    }

    @Override
    public void actualizar(EntityManager em, Cuenta cuenta) {
        em.merge(cuenta);
        
    }

    @Override
    public void eliminar(EntityManager em, Cuenta cuenta) {
        em.remove(cuenta);
        
    }

    @Override
    public void eliminarPorID(EntityManager em, Long id) {
        Cuenta cuenta = em.find(Cuenta.class, id);
        if(cuenta != null){
            em.remove(cuenta);
        }
        
    }
    
}
