/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author User
 */
public class TipoSedan extends Vehiculo{
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan( Comprador p, String m, double pb, double pd) {
        super(p, m, pb);
        porcentajeDescuento = pd;
        calcularPrecioFinal();
    }
    
    @Override
    public void calcularPrecioFinal(){
        valorDescuento = precioBase * (porcentajeDescuento / 100);
        seguroAdicionalMecanico = precioBase * 0.01;
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }

    public void establecerValorDescuento(double vd) {
        valorDescuento = vd;
    }

    public void establecerSeguroAdicionalMecanico(double sam) {
        seguroAdicionalMecanico = sam;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicionalMecanico() {
        return seguroAdicionalMecanico;
    }

    @Override
    public String toString() {
        return String.format("------------------------------\n"
                + "TipoSedan\n"
                + "--------------------------------------\n"
                + "Porcentaje de descuento: %.2f\n"
                + "Valor de descuento: %.2f\n"
                + "Seguro Adicional de Mecanico: %.2f\n", 
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguroAdicionalMecanico());
    }
    
    
    
    
    
}
