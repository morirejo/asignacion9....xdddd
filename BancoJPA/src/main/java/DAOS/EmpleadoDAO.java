/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import jakarta.persistence.EntityManager;
import java.util.List;
import models.Empleado;

/**
 *
 * @author MoriTejo
 */
public class EmpleadoDAO implements IEmpleadoDAO{

    @Override
    public void insertar(EntityManager em, Empleado e) {
        em.persist(e);
    }

    @Override
    public void actualizar(EntityManager em, Empleado e) {
        em.merge(e);
    }

    @Override
    public void eliminar(EntityManager em, Long id) {
        Empleado e = em.find(Empleado.class, id);
        if (e!= null){
            em.remove(e);
        }
    }

    @Override
    public Empleado buscar(EntityManager em, Long id) {
        return em.find(Empleado.class, id);
    }

    @Override
    public List<Empleado> listar(EntityManager em) {
        return em.createQuery("select e from Empleado e", Empleado.class).getResultList();
    }

    @Override
    public void aumentarSalario(EntityManager em, Long id, Double porcentaje) {
        Empleado e = em.find(Empleado.class, id);
        if (e != null) {
            double incremento = e.getSalario() * (porcentaje / 100);
            e.setSalario(e.getSalario() + incremento);
            em.merge(e);
        }
    }
    
}
