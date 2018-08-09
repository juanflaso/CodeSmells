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
public class CalcularTotalAreas {
    private Cuadrado[] formas;

    public CalcularTotalAreas(Cuadrado[] formas) {
        this.formas = formas;
    }
    
    public float calcularYSacarPromedio() {
        float total = this.calcularAreas();
        int n = formas.length;       
        return total/n;
    }
    
    
    public float calcularAreas() {
        int total = 0;
        for (FormaGeometrica forma : formas) {
            total += forma.area();
        }
        return total;
    }
    
    
}
