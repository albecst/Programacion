package lab_sesion4_4;

public class Vehiculo {

    /*Atributos*/
    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    private Conductor conductor;
    
    /*Constructor*/

    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
        this.conductor = conductor;
    }
    
    
    
    
    
    /*Get & set*/
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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

    /**
     * Get the value of matricula
     *
     * @return the value of matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Set the value of matricula
     *
     * @param matricula new value of matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String conductortxt = "ninguno";
        
        if (conductor != null){
            conductortxt = conductor.toString();
        }
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", luces=" + luces + "\n Conductor=" + conductortxt + '}';
    }


    
}
