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
public class CalcularTotalAreas {
    private Cuadrado[] formas;

    public CalcularTotalAreas(Cuadrado[] formas) {
        this.formas = formas;
    }
    
    public float calcularYSacarPromedio() {
        int total = 0;
        int n = formas.length;
        
        for (FormaGeometrica forma : formas) {
            total += forma.area();
        }
        
        float promedio;
        promedio = total/n;
        
        return promedio;
    }
}
