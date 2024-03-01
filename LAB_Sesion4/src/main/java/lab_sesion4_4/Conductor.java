package lab_sesion4_4;

public class Conductor {
    
    /*Atributos*/
    private String dni;
    private String nombre;
    private String tipoPermiso;
    private CarnetdeConducir carnet;

    
    /*Constructor*/
    public Conductor(String dni, String nombre, String tipoPermiso, CarnetdeConducir carnet) {
        this.dni = dni;
        this.nombre = nombre;
        this.tipoPermiso = tipoPermiso;
        this.carnet = carnet;
    }

    /*Get & Set*/

    public CarnetdeConducir getCarnet() {
        return carnet;
    }

    public void setCarnet(CarnetdeConducir carnet) {
        this.carnet = carnet;
    }
    
    public String getTipoPermiso() {
        return tipoPermiso;
    }

    /**
     * Set the value of tipoPermiso
     *
     * @param tipoPermiso new value of tipoPermiso
     */
    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    
    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Get the value of dni
     *
     * @return the value of dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Set the value of dni
     *
     * @param dni new value of dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre= " + nombre + ", tipoPermiso= " + tipoPermiso + "carnet = " + carnet.toString()+ "}";
    }
    
}
