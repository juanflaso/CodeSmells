/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RenameMethod.smell;

/**
 *
 * @author User
 */
public class Carro {
    public String matricula;

    public Carro(String matricula) {
        this.matricula = matricula;
    }
    
    public String getM(){
        return matricula;
    }
}
