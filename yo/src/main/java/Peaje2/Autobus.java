/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peaje2;


/**
 *
 * @author alber
 */
public class Autobus extends Vehiculo {
    
    //A
        private int pasajeros;
        
    //C
    public Autobus(int pasajeros, String matricula, int peso_kg) {
        super(matricula, peso_kg);
        this.pasajeros = pasajeros;
    }

    
    //M
    
    //G&S
    
    
    /**
     * Get the value of pasajeros
     *
     * @return the value of pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * Set the value of pasajeros
     *
     * @param pasajeros new value of pasajeros
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

}
