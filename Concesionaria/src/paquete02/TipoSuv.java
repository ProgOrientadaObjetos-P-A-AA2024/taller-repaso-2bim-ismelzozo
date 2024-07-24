/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author User
 */
public class TipoSuv extends Vehiculo{
    private double porcentajeSeguroPersonas;
    private double seguroPersonas;

    public TipoSuv(double psp, double sp, Comprador p, String m, double pb, double pf) {
        super(p, m, pb, pf);
        porcentajeSeguroPersonas = psp;
        seguroPersonas = sp;
    }
    
    @Override
    public void calcularPrecioFinal(){
        seguroPersonas = precioBase * (porcentajeSeguroPersonas/100);
        precioFinal = precioBase + seguroPersonas;
    }

    public void establecerPorcentajeSeguroPersonas(double psp) {
        this.porcentajeSeguroPersonas = psp;
    }

    public void establecerSeguroPersonas(double sp) {
        this.seguroPersonas = sp;
    }

    public double obtenerPorcentajeSeguroPersonas() {
        return porcentajeSeguroPersonas;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    @Override
    public String toString() {
        return String.format("TipoSuv\n"
                + "--------------------------------------\n"
                + "Porcentaje Adicional de seguro para personas: %f\n"
                + "Seguro Personas: %.2f\n", obtenerPorcentajeSeguroPersonas(),
                obtenerSeguroPersonas());
    }

    

    
}
