/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractClass.solution;

/**
 *
 * @author User
 */
public class Carro {
    
    private String marca;
    private String añoFabr;
    private String Modelo;
    private String paisOrigen;
    private String color;
    private String cilindraje;
    private Matricula matricula;

    public Carro(String marca, String añoFabr, String Modelo, String paisOrigen, String color, String cilindraje, Matricula matricula) {
        this.marca = marca;
        this.añoFabr = añoFabr;
        this.Modelo = Modelo;
        this.paisOrigen = paisOrigen;
        this.color = color;
        this.cilindraje = cilindraje;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
