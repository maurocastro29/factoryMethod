/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import logica.Bus;
import logica.Carro;
import logica.Moto;
import logica.Vehiculo;

/**
 *
 * @author HP
 */
public class FabricaVehiculo {
    
    public Vehiculo getVehiculo(String tipo){
        if(tipo == "Carro"){
            return new Carro();
        }else if(tipo == "Moto"){
            return new Moto();
        }else if(tipo == "Bus"){
            return new Bus();
        }
        return null;
    }
}