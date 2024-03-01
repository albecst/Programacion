package poo.lab_sesion4_2;

public class Lampara {
 
    /*Atributos*/
    private boolean encendida;
    private int intensidad;
    private double voltaje;


    
    /*Constructor*/
    public Lampara(boolean encendida, int intensidad, double voltaje) {
        this.encendida = encendida;
        this.intensidad = intensidad;
        this.voltaje = voltaje;
    }
    
    
    
    /*Métodos get & set*/
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * Set the value of voltaje
     *
     * @param voltaje new value of voltaje
     */
    public void setVoltaje(double voltaje) {
        if(1.5 <= voltaje && voltaje <= 12.5){
            this.voltaje = voltaje;
        }
        else{
            this.voltaje = -1;
        }
    }

    
    public int getIntensidad() {
        return intensidad;
    }

    /**
     * Set the value of intensidad
     *
     * @param voltaje
     * @return 
     */
    public int setIntensidad(double voltaje) {
        if(voltaje <= 1.5){
            this.intensidad = 0;
    }
        else if(voltaje >= 12.5){
            this.intensidad = 100;
        }
        return intensidad;
    }

    
    /**
     * Get the value of encendida
     *
     * @return the value of encendida
     */
    public boolean isEncendida() {
        return encendida;
    }

    /**
     * Set the value of encendida
     *
     * @param encendida new value of encendida
     */
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    
    
    
    
    }

    @Override
    public String toString() {
        
        
        return "Lampara{" + "encendida=" + encendida + ", intensidad=" + setIntensidad(voltaje)+ "}";
    }
   
}
