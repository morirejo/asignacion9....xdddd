/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bancojpa;

import DAOS.EmpleadoDAO;
import DAOS.IEmpleadoDAO;
import controllers.CuentaController;
import jakarta.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;
import models.Empleado;
import models.Estatus;
import utils.JpaUtil;

/**
 *
 * @author LABORATORIOS
 */
public class BancoJPA {

    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        IEmpleadoDAO dao = new EmpleadoDAO();
        
        
        
        em.getTransaction().begin();
        
        Empleado empleado1 = new Empleado("juan carlos", "juanCarlos@bodoque.com", 12000.0, Estatus.ACTIVO, LocalDate.now());
        Empleado empleado2 = new Empleado("Albertano", "elGuapo@yahoo.com", 8000.0, Estatus.ACTIVO, LocalDate.now());
        
        dao.insertar(em, empleado1);
        dao.insertar(em, empleado2);
        
        em.getTransaction().commit();
        
        
        System.out.println("lissta de empleados");
        imprimirEmpleados(dao.listar(em));
        System.out.println("");
        System.out.println("Empleado a inactivo");
        em.getTransaction().begin();

        Empleado albertano = dao.buscar(em, 2L); 
        if (albertano != null) {
            albertano.setEstatus(Estatus.INACTIVO);
            dao.actualizar(em, albertano);
        }

        em.getTransaction().commit();
        imprimirEmpleados(dao.listar(em));
        System.out.println("");
        
        System.out.println("Aumentar salario");
        try {
            em.getTransaction().begin();

            dao.aumentarSalario(em, 1L, 10.0); 

            em.getTransaction().commit();

            Empleado juanActualizada = dao.buscar(em, 1L);
            imprimirEmpleados(dao.listar(em));
            System.out.println("Salario actualizado: " + juanActualizada.getSalario());

        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Ocurrió un error al aumentar el salario, se revirtieron los cambios: " + ex.getMessage());
        }
        
        System.out.println("");
        System.out.println("eliminar empleado");
        em.getTransaction().begin();
            
        dao.eliminar(em, 1L);
            
        em.getTransaction().commit();
        imprimirEmpleados(dao.listar(em));
        
        em.close();
        
    }
    
    private static void imprimirEmpleados(List<Empleado> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay empleados.");
        } else {
            for (Empleado e : lista) {
                System.out.println(e);
            }
        }
    }
}
