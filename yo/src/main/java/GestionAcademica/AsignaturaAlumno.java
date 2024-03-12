package GestionAcademica;

public class AsignaturaAlumno {
    
    //A
    private double calificacion;
    private int convocatoria;
    private Asignatura asignatura;

    //C
    public AsignaturaAlumno(Asignatura asignatura, double calificacion, int convocatoria) {
        this.asignatura = asignatura;
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
    }

    
    
    
    /**
     * Get the value of convocatoria
     *
     * @return the value of convocatoria
     */
    public int getConvocatoria() {
        return convocatoria;
    }

    /**
     * Set the value of convocatoria
     *
     * @param convocatoria new value of convocatoria
     */
    public void setConvocatoria(int convocatoria) {
        this.convocatoria = convocatoria;
    }

    /**
     * Get the value of calificacion
     *
     * @return the value of calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Set the value of calificacion
     *
     * @param calificacion new value of calificacion
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString() +" AsignaturaAlumno{" + "calificacion=" + calificacion + ", convocatoria=" + convocatoria + '}';
    }
 
}
