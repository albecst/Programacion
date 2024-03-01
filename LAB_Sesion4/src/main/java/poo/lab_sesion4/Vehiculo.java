package poo.lab_sesion4;

public class Vehiculo {

    private String matrícula;
    private String marca;
    private int velocidad;
    private String modelo;
    private boolean luces;
    private int marcha;
    
    public Vehiculo(String matrícula, String marca, String modelo, int velocidad, boolean luces, int marcha, String rojo) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.luces = luces;
        this.marcha = marcha;
    }

    public Vehiculo(String matrícula, String marca, String modelo, int marcha) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
        this.luces = false;
    }
    
    

    
    
    /**
     * Get the value of marcha
     *
     * @return the value of marcha
     */
    public int getMarcha() {
        return marcha;
    }

    /**
     * Set the value of marcha
     *
     * @param marcha new value of marcha
     */
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    /**
     * Get the value of luces
     *
     * @return the value of luces
     */
    public boolean isLuces() {
        return luces;
    }

    /**
     * Set the value of luces
     *
     * @param luces new value of luces
     */
    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Get the value of velocidad
     *
     * @return the value of velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Set the value of velocidad
     *
     * @param velocidad new value of velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    @Override
    public String toString() {
        switch(marcha){
            case 0:
                velocidad = 0;
                break;
            
            case 1:
                velocidad = 10;
                break;
                
            case 2:
                velocidad = 30;
                break;
                
            case 3:
                velocidad = 60;
                break;
                
            case 4:
                velocidad = 90;
                break;
            
            case 5:
                velocidad = 120;
                break;
                
            default: velocidad = 0;
        }
        return "Veh\u00edculo{" + "matr\u00edcula=" + matrícula + ", marca=" + marca + ", velocidad=" + velocidad + ", modelo=" + modelo + ", luces=" + luces + ", marcha=" + marcha + "}";
    }

    void setColor(String negro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
