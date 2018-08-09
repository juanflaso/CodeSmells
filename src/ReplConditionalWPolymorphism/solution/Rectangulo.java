/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReplConditionalWPolymorphism.solution;

/**
 *
 * @author User
 */
public class Rectangulo implements FormaGeometrica{

    private final float base;
    private final float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area() {
        return base*altura;
    }

    @Override
    public float perimetro() {
        return (2*base)+(2*altura);
    }
    
}
