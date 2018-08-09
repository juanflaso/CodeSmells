/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replaceDataWObject.smell;

/**
 *
 * @author User
 */
public class Local {
    private String telefono;
    private String direccion;
    private String gerente;

    public Local(String telefono, String direccion, String gerente) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
}
