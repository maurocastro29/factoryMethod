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
public class Carro implements Vehiculo{
    private final int ocupantes;
    private final int llantas;

    public Carro() {
        this.ocupantes = 5;
        this.llantas = 4;
    }

    @Override
    public void crear() {
        System.out.println("Vehiculo tipo: Carro creado");
    }
    @Override
    public void encender(){
        System.out.println("Carro encendido");
    }
    @Override
    public void apagar(){
        System.out.println("Carro apagado");
    }
}
