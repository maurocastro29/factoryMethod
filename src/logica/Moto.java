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
public class Moto implements Vehiculo{
    private int ocupantes;
    private int llantas;

    public Moto() {
        this.ocupantes = 2;
        this.llantas = 2;
    }

    @Override
    public void crear() {
        System.out.println("Vehiculo tipo: Moto creado.");
    }
    public void encender(){
        System.out.println("Moto encendida");
    }
    public void apagar(){
        System.out.println("Moto apagada");
    }
}
