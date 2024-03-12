package Peaje2;

public class Agente {
    
    //A
    private String dni;
    private String nombre;
   
    //C

    public Agente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //M
    
    //G&S
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
        return "Agente{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }

    
}
