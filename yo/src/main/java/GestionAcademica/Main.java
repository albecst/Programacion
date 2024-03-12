package GestionAcademica;

public class Main {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("09128625V", "Josele", "Avenida Avenida 26", "Matemáticas");
        Asignatura Matematicas = new Asignatura("Matematicas", 60, 2, "Obligatoria");
        Asignatura IA = new Asignatura("Inteligencia Artificial", 60, 1, "Troncal");
        
        profesor1.addAsignatura(Matematicas);
        profesor1.addAsignatura(IA);
        
        Alumno alumno1 = new Alumno("09126517W", "Richi", "Calle Calle", "GII");
        AsignaturaAlumno MatematicasAlumno = new AsignaturaAlumno(Matematicas, 9.6, 1);
        AsignaturaAlumno IAAlumno = new AsignaturaAlumno(IA, 8.5, 1);
        alumno1.addAsignaturaAlumno(MatematicasAlumno);
        alumno1.addAsignaturaAlumno(IAAlumno);
        
        System.out.println(alumno1.notaMedia());
        System.out.println(profesor1.calificacion(IA,IAAlumno.getCalificacion(),1));
        
    }
}
