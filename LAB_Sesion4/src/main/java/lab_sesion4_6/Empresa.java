package lab_sesion4_6;

public class Empresa {
    private String nombre;
    private String cif;

    // Constructor
    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    // Getters y Setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Información textual de la empresa
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}