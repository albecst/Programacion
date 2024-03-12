/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peaje;

import java.util.ArrayList;

public class Cabina {
    
    //A
    private ArrayList <Camion> camiones = new ArrayList<>();
    private Agente Agente;
    private static int cuenta = 0;

    //C
    public Cabina(Agente Agente) {
        this.Agente = Agente;
    }
    
    //M
    public int cuenta(){
        cuenta += 1;
        return cuenta;
    }
    
    public String resumen(Camion camion){
        double resultado = 0;
        resultado = camion.getEjes()*5 + camion.getTonelada()*2;
        return camion.toString() + " - Peaje: "+ resultado +"€";
    }
    
    public String recibo(){
        double precio = 0;
        for (Camion camion:camiones){
            precio += camion.getEjes()*5 + camion.getTonelada()*2;
            cuenta = cuenta();
        }
        return "Se han cobrado " + cuenta + " camiones, y el importe es de "+ precio + "€";
    }
    
    
    
    public void addCamion(Camion camion) {
        camiones.add(camion); }

    
    public ArrayList<Camion> getCamiones() {
        return camiones;
    }
    
    
     
     
     
    /**
     * Get the value of Agente
     *
     * @return the value of Agente
     */
    public Agente getAgente() {
        return Agente;
    }

    /**
     * Set the value of Agente
     *
     * @param Agente new value of Agente
     */
    public void setAgente(Agente Agente) {
        this.Agente = Agente;
    }  
    }

