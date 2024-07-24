/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author User
 */
public abstract class Vehiculo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador p, String m, double pb, double pf) {
        propietario = p;
        marca = m;
        precioBase = pb;
        precioFinal = pf;
    }
    
    public abstract void calcularPrecioFinal();

    public void establecerPropietario(Comprador pro) {
        propietario = pro;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecioBase(double pb) {
        precioBase = pb;
    }

    public void establecerPrecioFinal(double pf) {
        precioFinal = pf;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    
    
    
    
    @Override
    public String toString() {
        return String.format("VEHICULO\n"
                + "---------------------------------\n"
                + "Propietario: \n"
                + "Marca: %s\n"
                + "Precio Base: %.2f\n"
                + "Precio Final: %.2f\n",
                obtenerPropietario(),obtenerMarca(),obtenerPrecioBase(),
                obtenerPrecioFinal());
    }

}
