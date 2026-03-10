/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author LABORATORIOS
 */
public class Direccion {
    private String calle;
    private String numeroCasa;
    private String ciudad;
    private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String ciudad, String pais) {
        this.calle = calle;
        this.numeroCasa = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numero) {
        this.numeroCasa = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
