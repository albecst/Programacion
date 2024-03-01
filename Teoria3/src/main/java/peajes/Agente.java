package peajes;

public class Agente {
    
    //Atributos//
    private String dni;
    private String nombre;

    //Constructor//

    public Agente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    
    //Getter & Setter//
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
