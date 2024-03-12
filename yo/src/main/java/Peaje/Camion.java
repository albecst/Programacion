/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peaje;


public class Camion {
    
    //A
    private int ejes;
    private double tonelada;
    private String nombre;

    //C

    public Camion(String nombre, int ejes, double tonelada) {
        this.nombre = nombre;
        this.ejes = ejes;
        this.tonelada = tonelada;
    }
    
    //M

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    /**
     * Get the value of tonelada
     *
     * @return the value of tonelada
     */
    public double getTonelada() {
        return tonelada;
    }

    /**
     * Set the value of tonelada
     *
     * @param tonelada new value of tonelada
     */
    public void setTonelada(int tonelada) {
        this.tonelada = tonelada;
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

    @Override
    public String toString() {
        return "Camion{" + "ejes=" + ejes + ", tonelada=" + tonelada + ", nombre=" + nombre + '}';
    }

    
    
}
