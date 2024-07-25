/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import java.util.List;
import paquete02.Vehiculo;

/**
 *
 * @author User
 */
public class Concesionaria {
    private List<Vehiculo> listadoVehiculos;
    private String nombre;
    private double ventasTotales;
    private double costoVehiculoCaro;
    private double costoVehiculoBarato;

    public Concesionaria(String nom) {
        nombre = nom;
        listadoVehiculos = new ArrayList<>();
        ventasTotales = 0;
        costoVehiculoCaro = 0;
        costoVehiculoBarato = 0;
    }
    public void agregarVehiculo(Vehiculo vehiculo) {
        listadoVehiculos.add(vehiculo);
        ventasTotales += vehiculo.obtenerPrecioFinal();
        if (vehiculo.obtenerPrecioFinal() > costoVehiculoCaro) {
            costoVehiculoCaro = vehiculo.obtenerPrecioFinal();
        }
        if (vehiculo.obtenerPrecioFinal()< costoVehiculoBarato) {
            costoVehiculoBarato = vehiculo.obtenerPrecioFinal();
        }
    }

    public void establecerListadoVehiculos(List<Vehiculo> lv) {
        listadoVehiculos = lv;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerVentasTotales(double vt) {
        ventasTotales = vt;
    }

    public void establecerCostoVehiculoCaro(double cvc) {
        costoVehiculoCaro = cvc;
    }

    public void establecerCostoVehiculoBarato(double cvb) {
        costoVehiculoBarato = cvb;
    }

    public List<Vehiculo> obtenerListadoVehiculos() {
        return listadoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerCostoVehiculoCaro() {
        return costoVehiculoCaro;
    }

    public double obtenerCostoVehiculoBarato() {
        return costoVehiculoBarato;
    }

    
    
    @Override
    public String toString() {
        return "-----------------------------------\n"
                + "Concesionaria\n"
                + "--------------------------------\n" + 
                "Listado de Vehiculos:\n" + listadoVehiculos +
                "Nombre: " + nombre +"\n"+ 
                "Ventas Totales: " + ventasTotales +"\n"+
                "Costo de Vehiculo mas Caro: " + costoVehiculoCaro + "\n"+
                "Costo de Vehiculo mas Barato: " + costoVehiculoBarato;
    }

    /*@Override
    public String toString() {
        return String.format("CONCESIONARIA\n"
                + "----------------------------------------------\n"
                + "Listado de Vehiculos: \n"
                + "Nombre: %s\n"
                + "Ventas Totales: %.2f\n"
                + "Costo de vehiculo mas Caro: %.2f\n"
                + "Costo de vehiculo mas barato: %.2f\n",
                obtenerListadoVehiculos(),
                nombre,
                obtenerVentasTotales(),
                obtenerCostoVehiculoCaro(),
                obtenerCostoVehiculoBarato());
    }
    */
    
    
    
}
