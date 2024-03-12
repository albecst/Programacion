package GestionAcademica;

import java.util.ArrayList;

public class Profesor {

    //A
    private String dni;
    private String nombre;
    private String direccion;
    private String departamento;
    private ArrayList<Asignatura> asignaturasP = new ArrayList<>();

    
    
    //C
    public Profesor(String dni, String nombre, String direccion, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
    }
    
    //M
    public String calificacion(Asignatura asignatura, double nota, int convocatoria){
        String cadena = null;
        if (nota >= 0 && nota <= 4.9){
            cadena = "SUSPENSO";
        }
        if (nota >= 5 && nota <= 6.9){
            cadena = "APROBADO";
        }
        if (nota >= 7 && nota <= 8.9){
            cadena = "NOTABLE";
        }
        if (nota >= 9 && nota <= 10){
            cadena = "SOBRESALIENTE";
        }   
        return "La nota de " + asignatura.getNombre() + " es un "+cadena;
    }
    
    
    
    public void addAsignatura(Asignatura asignatura) {
        this.asignaturasP.add(asignatura);
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturasP;
    }

    
    
    //G&S    
    /**
     * Get the value of departamento
     *
     * @return the value of departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Set the value of departamento
     *
     * @param departamento new value of departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        return "Profesor{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", departamento=" + departamento + ", asignaturasP=" + asignaturasP + '}';
    }
}
