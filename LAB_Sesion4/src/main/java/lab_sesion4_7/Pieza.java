package lab_sesion4_7;

public class Pieza {
    
    //Atributos
    private String nombre;
    private double precio;

    //Constructor

    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }   
    
    //Getter & Setter
    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Pieza{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    
    
}
