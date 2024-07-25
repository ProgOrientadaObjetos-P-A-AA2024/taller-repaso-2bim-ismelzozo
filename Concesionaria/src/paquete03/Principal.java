/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Concesionaria;
import paquete02.Comprador;
import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
        Comprador c1 = new Comprador("David Perez", "112245781");
        Comprador c2 = new Comprador("Juan Salinas", "4578124574");

        TipoSuv suv = new TipoSuv(c1, "Toyota", 27000, 10);
        TipoSedan sedan = new TipoSedan(c2, "Ford", 40000, 5);
        TipoCamioneta camioneta = new TipoCamioneta(c2, "Chevrolet", 35000, 15);

        Concesionaria con = new Concesionaria("Autos S.A");
        con.agregarVehiculo(suv);
        con.agregarVehiculo(sedan);
        con.agregarVehiculo(camioneta);

        System.out.println(con);

    }
}
