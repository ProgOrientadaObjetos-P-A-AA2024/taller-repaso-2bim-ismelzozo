/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author User
 */
public class TipoCamioneta extends Vehiculo{
    private double porcentajeAddicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroAdicionalMantenimiento;

    public TipoCamioneta(double pai, double vai, double sam, Comprador p, String m, double pb, double pf) {
        super(p, m, pb, pf);
        this.porcentajeAddicionalImportacion = pai;
        this.valorAdicionalImportacion = vai;
        this.seguroAdicionalMantenimiento = sam;
    }
    
    
    @Override
    public void calcularPrecioFinal(){
        valorAdicionalImportacion = precioBase * (porcentajeAddicionalImportacion/100);
        seguroAdicionalMantenimiento = valorAdicionalImportacion * 1.5;
        precioFinal = precioBase + valorAdicionalImportacion + seguroAdicionalMantenimiento;
    }
    

    public void establecerPorcentajeAddicionalImportacion(double pai) {
        this.porcentajeAddicionalImportacion = pai;
    }

    public void establecerValorAdicionalImportacion(double vai) {
        this.valorAdicionalImportacion = vai;
    }

    public void establecerSeguroAdicionalMantenimiento(double sam) {
        this.seguroAdicionalMantenimiento = sam;
    }

    public double obtenerPorcentajeAddicionalImportacion() {
        return porcentajeAddicionalImportacion;
    }

    public double obtenerValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double obtenerSeguroAdicionalMantenimiento() {
        return seguroAdicionalMantenimiento;
    }

    @Override
    public String toString() {
        return String.format("TipoCamioneta\n"
                + "---------------------------------------\n"
                + "Porcentaje adicional fijo por importacion: %.2f\n"
                + "Valor adicional fijo de importacion: %.2f\n"
                + "Seguro adicional de Mantenimiento: %.2f\n",
                obtenerPorcentajeAddicionalImportacion(),
                obtenerValorAdicionalImportacion(),
                obtenerSeguroAdicionalMantenimiento());
    }
    
    
    
    
}
