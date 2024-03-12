package GestionAcademica;

import java.util.ArrayList;

public class Alumno {

    //A
    private String dni;
    private String nombre;
    private String direccion;
    private String titulacion;
    private ArrayList<AsignaturaAlumno> asignaturas = new ArrayList<>();

    //C
    public Alumno(String dni, String nombre, String direccion, String titulacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.titulacion = titulacion;
    }

    //M 
    public String notaMedia (){
        double notas = 0;
        int contador = 0;
        for (AsignaturaAlumno asignatura : asignaturas){
            notas += asignatura.getCalificacion();
            contador += 1;
        }
        return "Tu nota media es un "+notas/contador + ", ¡Enhorabuena!";
    }
    
    public void addAsignaturaAlumno(AsignaturaAlumno asignaturaalumno) {
        this.asignaturas.add(asignaturaalumno);
    }

    public ArrayList<AsignaturaAlumno> getAsignaturasAlumno() {
        return asignaturas;
    }

    //G&S
    /**
     * Get the value of titulacion
     *
     * @return the value of titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * Set the value of titulacion
     *
     * @param titulacion new value of titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
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
        return "Alumno{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", titulacion=" + titulacion + ", asignaturas=" + asignaturas + '}';
    }

}
