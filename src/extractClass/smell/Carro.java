/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractClass.smell;

import java.util.Date;

/**
 *
 * @author User
 */
public class Carro {
    private String placa;
    private Date fechaMatricula;
    private String marca;
    private String clase;
    private String tipo;
    private String añoFabr;
    private String Modelo;
    private String paisOrigen;
    private String color;
    private String cilindraje;
    private String nombreDueno;
    private String cedulaDueno;
    private String telefonoDueno;

    public Carro(String placa, Date fechaMatricula, String marca, String clase, String tipo, String añoFabr, String Modelo, String paisOrigen, String color, String cilindraje, String nombreDueno, String cedulaDueno, String telefonoDueno) {
        this.placa = placa;
        this.fechaMatricula = fechaMatricula;
        this.marca = marca;
        this.clase = clase;
        this.tipo = tipo;
        this.añoFabr = añoFabr;
        this.Modelo = Modelo;
        this.paisOrigen = paisOrigen;
        this.color = color;
        this.cilindraje = cilindraje;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.telefonoDueno = telefonoDueno;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getTelefonoDueno() {
        return telefonoDueno;
    }

    public void setTelefonoDueno(String telefonoDueno) {
        this.telefonoDueno = telefonoDueno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAñoFabr() {
        return añoFabr;
    }

    public void setAñoFabr(String añoFabr) {
        this.añoFabr = añoFabr;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
