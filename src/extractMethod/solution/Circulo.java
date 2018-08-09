/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractMethod.solution;

/**
 *
 * @author User
 */
public class Circulo implements FormaGeometrica{
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
