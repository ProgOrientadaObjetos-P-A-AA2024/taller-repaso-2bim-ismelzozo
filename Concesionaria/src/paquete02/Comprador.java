/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author User
 */
public class Comprador {
    private String nombres;
    private String cedula;

    public Comprador(String n, String c) {
        nombres = n;
        cedula = c;
    }
    
    

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nombres=" + nombres + ", cedula=" + cedula + '}';
    }
    
}
