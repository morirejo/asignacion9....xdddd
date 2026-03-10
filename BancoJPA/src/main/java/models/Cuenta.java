/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;

/**
 *
 * @author LABORATORIOS
 */
@Entity
@Table(name= "cuentas", uniqueConstraints = {@UniqueConstraint(columnNames = {"numero"})})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(name = "numero", nullable = false, length = 20)
    private String numero;
    
    @Column(name = "titular", nullable = false, length = 100)
    private String titular;
    
    @Enumerated(EnumType.STRING)
    private TipoCuenta tipo;
    
    @Embedded 
    private Direccion direccion;
    
    @Column(name = "saldo")
    private Double saldo;
    
    @Transient
    private Double saldoTemporal;

    public Cuenta() {
    }

    public Cuenta(Long id, String numero, String titular, TipoCuenta tipo, Direccion direccion, Double saldo, Double saldoTemporal) {
        this.id = id;
        this.numero = numero;
        this.titular = titular;
        this.tipo = tipo;
        this.direccion = direccion;
        this.saldo = saldo;
        this.saldoTemporal = saldoTemporal;
    }
    
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldoTemporal() {
        return saldoTemporal;
    }

    public void setSaldoTemporal(Double saldoTemporal) {
        this.saldoTemporal = saldoTemporal;
    }
    
    
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.cuenta[ id=" + id + " ]";
    }
    
}
