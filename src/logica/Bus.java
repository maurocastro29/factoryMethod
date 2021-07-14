/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author HP
 */
public class Bus implements Vehiculo{
    private final int ocupantes;
    private final int llantas;

    public Bus() {
        this.ocupantes = 25;
        this.llantas = 6;
    }
    
    @Override
    public void crear() {
        System.out.println("Vehiculo tipo: Bus creado.");
    }
    @Override
    public void encender(){
        System.out.println("Bus encendido");
    }
    @Override
    public void apagar(){
        System.out.println("Bus apagado");
    }
    
}
