/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peaje2;

/**
 *
 * @author alber
 */
public class Camion extends Vehiculo{
 
        private int ejes;

    public Camion(int ejes, String matricula, int peso_kg) {
        super(matricula, peso_kg);
        this.ejes = ejes;
    }

        
        

    /**
     * Get the value of ejes
     *
     * @return the value of ejes
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * Set the value of ejes
     *
     * @param ejes new value of ejes
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
