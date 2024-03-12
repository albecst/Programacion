package GestionAcademica;

public class Asignatura {

    //A
    private String nombre;
    private int creditos;
    private int cuatrimestre;
    private String tipo;

    //C
    public Asignatura(String nombre, int creditos, int cuatrimestre, String tipo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }

    
    
    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    /**
     * Get the value of cuatrimestre
     *
     * @return the value of cuatrimestre
     */
    public int getCuatrimestre() {
        return cuatrimestre;
    }

    /**
     * Set the value of cuatrimestre
     *
     * @param cuatrimestre new value of cuatrimestre
     */
    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    
    /**
     * Get the value of creditos
     *
     * @return the value of creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Set the value of creditos
     *
     * @param creditos new value of creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
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
        return "Asignatura{" + "nombre=" + nombre + ", creditos=" + creditos + ", cuatrimestre=" + cuatrimestre + ", tipo=" + tipo + '}';
    }

    
}
