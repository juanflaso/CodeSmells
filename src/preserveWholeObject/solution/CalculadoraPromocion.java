/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preserveWholeObject.solution;

/**
 *
 * @author User
 */
public class CalculadoraPromocion {

    public CalculadoraPromocion() {
    }
    
    public float calcular(Producto producto) {
        return producto.getPrecio()*producto.getPorcentajeDescuento();
    }
}
