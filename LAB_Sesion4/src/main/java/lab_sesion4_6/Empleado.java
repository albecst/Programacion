package lab_sesion4_6;
public class Empleado extends Persona {
    private double sueldo;
    private String categoria;
    private Departamento departamento;

    
    // Constructor
    public Empleado(String dni, String nombre, int edad, String estado, double sueldo,
                    String categoria, Departamento departamento) {
        super(dni, nombre, edad, estado);
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.departamento = departamento;
        this.departamento.altaEmpleado(this);
    }

    // Getters y Setters
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Información textual del empleado
    @Override
    public String toString() {
        return super.toString() + " # Empleado{" +
                "sueldo=" + sueldo +
                ", categoria='" + categoria + '\'' +
                ", departamento=" + departamento.getNombre() +
                '}';
    }
}
