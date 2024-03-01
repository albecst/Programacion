package lab_sesion4_7;


public class Taller {
    private String nombre;
    private String telefono;
    private double precioHora;

    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }

    public double repararVehiculo(Vehiculo vehiculo, int horas) {
        double costePiezas = 0;
        for (Pieza pieza : vehiculo.getPiezas()) {
            costePiezas += pieza.getPrecio();
        }
        return costePiezas + (horas * precioHora);
    }

    //Getters & Setters
    /**
     * Get the value of precioHora
     *
     * @return the value of precioHora
     */
    public double getPrecioHora() {
        return precioHora;
    }

    /**
     * Set the value of precioHora
     *
     * @param precioHora new value of precioHora
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

}
