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
public class Producto {
    private String nombre;
    private float precio;
    private float porcentajeDescuento;

    public Producto(String nombre, float precio, float porcentajeDescuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    public float calcularDescuento() {
        CalculadoraPromocion calc = new CalculadoraPromocion();
        return calc.calcular(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
}
