/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractClass.solution;

import java.util.Date;

/**
 *
 * @author User
 */
public class Matricula {
    private String placa;
    private Date fechaMatricula;
    private String clase;
    private String tipo;
    private Propietario propietario;

    public Matricula(String placa, Date fechaMatricula, String clase, String tipo, Propietario propietario) {
        this.placa = placa;
        this.fechaMatricula = fechaMatricula;
        this.clase = clase;
        this.tipo = tipo;
        this.propietario = propietario;
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

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
   
}
