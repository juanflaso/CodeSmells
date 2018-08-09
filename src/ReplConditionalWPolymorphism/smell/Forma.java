/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReplConditionalWPolymorphism.smell;

/**
 *
 * @author User
 */
public class Forma {
    private String tipo;
    private float base;
    private float altura;
    
    public float area() {
        switch (tipo) {
            case "triangulo":
                return (base*altura)/2;
            case "rectangulo":
                return base*altura;
            default: 
                throw new IllegalArgumentException("Forma inválida");
        }
    }
}
