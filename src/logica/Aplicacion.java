/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import fabrica.FabricaVehiculo;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {
        FabricaVehiculo fabrica=new FabricaVehiculo();
        
        Vehiculo v1= fabrica.getVehiculo("Carro");
        v1.crear();
        v1.encender();
        v1.apagar();
        Vehiculo v2= fabrica.getVehiculo("Bus");
        v2.crear();
        v2.encender();
        v2.apagar();
        Vehiculo v3= fabrica.getVehiculo("Moto");
        v3.crear();
        v3.encender();
        v3.apagar();
        
    }
}
