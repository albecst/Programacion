/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peaje2;


/**
 *
 * @author alber
 */
public class Cabina {
    
    //A
    private String id;     
    private Agente agente;
    private static int cuenta;
    private static int cuentaC;
    private static double gasto;
    private static double recaudacion;
    private static double recaudacionC;

    //C
    public Cabina(String id, Agente agente) {
        this.id = id;
        this.agente = agente;
    }
    
    //M
    public String importeUnitarioAutobus(Autobus autobus){
            gasto = 1*autobus.getPasajeros() + 5*autobus.getPeso_kg()/1000;
            cuenta += 1;
            recaudacionAutobus(autobus);
        return "Se ha cobrado a este autobús = "+gasto+"€ \n Llevamos "+cuenta+" autobuses";
    }
    
    public double recaudacionAutobus(Autobus autobus){
        recaudacion += 1*autobus.getPasajeros() + 5*autobus.getPeso_kg()/1000;
        return recaudacion;
    }
    
    public String importeTotalAutobuses(){
        return "La cuenta de Autobuses es: " + cuenta + " autobus/es y se han recaudado: " + recaudacion + "€ (desde el principio)";
    }
    
    public String importeUnitarioCamion(Camion camion){
            gasto = 5*camion.getEjes() + 2*camion.getPeso_kg()/1000;
            cuentaC += 1;
            recaudacionCamion(camion);
        return "Se ha cobrado a este camion = "+gasto+"€ \nLlevamos "+cuentaC+ " camiones";
    }
    
    public double recaudacionCamion(Camion camion){
        recaudacionC += 5*camion.getEjes() + 2*camion.getPeso_kg()/1000;
        return recaudacionC;
    }
    
    public String importeTotalCamion(){
        return "La cuenta de Camiones es: " + cuentaC + " camion/es, y se han recaudado: " + recaudacionC + "€ (desde el principio)";
    }

    public String importeTotal(){
        double recaudacionTotal = recaudacion + recaudacionC;
        int cuentaTotal = cuenta + cuentaC;
        return "La recaudación total ha sido de = "+recaudacionTotal+"€, y han sido cobrados = "+cuentaTotal+" vehiculos";
    }
    
    
    /**
     * Get the value of agente
     *
     * @return the value of agente
     */
    public Agente getAgente() {
        return agente;
    }

    /**
     * Set the value of agente
     *
     * @param agente new value of agente
     */
    public void setAgente(Agente agente) {
        this.agente = agente;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
