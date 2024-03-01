package lab_sesion4_6;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String id;
    private String localizacion;
    private Empresa empresa;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Departamento(String nombre, String id, String localizacion, Empresa empresa) {
        this.nombre = nombre;
        this.id = id;
        this.localizacion = localizacion;
        this.empresa = empresa;
        empleados = new ArrayList<>();
    }

    // Métodos para gestionar empleados
    public void altaEmpleado(Empleado emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
            emp.setDepartamento(this);
        }
    }

    public void bajaEmpleado(Empleado emp) {
        if (empleados.contains(emp)) {
            empleados.remove(emp);
            emp.setDepartamento(null);
        }
    }

    // Getters y Setters
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    // Información textual del departamento
    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }
}