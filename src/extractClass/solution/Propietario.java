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
public class Propietario {
    private String nombreDueno;
    private String cedulaDueno;
    private String telefonoDueno;

    public Propietario(String nombreDueno, String cedulaDueno, String telefonoDueno) {
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
    
}
