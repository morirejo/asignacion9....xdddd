/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

import jakarta.persistence.EntityManager;
import java.util.List;
import models.Empleado;

/**
 *
 * @author MoriTejo
 */
public interface IEmpleadoDAO {
    public void insertar(EntityManager em, Empleado e);
    public void actualizar(EntityManager em,  Empleado e);
    public void eliminar(EntityManager em, Long id);
    public Empleado buscar(EntityManager em, Long id);
    public List<Empleado> listar(EntityManager em);
    public void aumentarSalario(EntityManager em, Long id, Double porcentaje);
}
