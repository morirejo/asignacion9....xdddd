/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

import jakarta.persistence.EntityManager;
import java.util.List;
import models.Cuenta;

/**
 *
 * @author LABORATORIOS
 */
public interface ICuentaDAO {
    public void guardar(EntityManager em, Cuenta cuenta);
    public Cuenta buscar(EntityManager em, Long id);
    public List<Cuenta> buscarTodas(EntityManager em);
    public void actualizar(EntityManager em, Cuenta cuenta);
    public void eliminar(EntityManager em, Cuenta cuenta);
    public void eliminarPorID(EntityManager em, Long id);
    
    
    
}
