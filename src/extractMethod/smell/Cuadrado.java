/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractMethod.smell;

/**
 *
 * @author User
 */
public class Cuadrado implements FormaGeometrica{
    
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return 4*lado;
    }
}
