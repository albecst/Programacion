package lab_sesion4_6.nominas;

import java.time.LocalDateTime;
import lab_sesion4_6.Departamento;
import lab_sesion4_6.Empleado;
import lab_sesion4_6.Empresa;

public class Nomina {
    
    //Atributos
    private Empresa empresa;
    private Departamento departamento;
    private Empleado empleado;
    private double salarioBruto;
    private double retencion;
    private double salarioNeto;
    private LocalDateTime fecha;

    //Constructor

    public Nomina(Empresa empresa, Departamento departamento, Empleado empleado, double retencion) {
        this.empresa = empresa;
        this.departamento = departamento;
        this.empleado = empleado;
        this.retencion = retencion;
    }

    
    //Métodos
    
    
    
    //Getter & Setter auto
    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
 
    
    /**
     * Get the value of salarioNeto
     *
     * @return the value of salarioNeto
     */
    public double getSalarioNeto() {
        return salarioNeto;
    }

    /**
     * Set the value of salarioNeto
     *
     * @param salarioNeto new value of salarioNeto
     */
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    /**
     * Get the value of retencion
     *
     * @return the value of retencion
     */
    public double getRetencion() {
        return retencion;
    }

    /**
     * Set the value of retencion
     *
     * @param retencion new value of retencion
     */
    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    /**
     * Get the value of salarioBruto
     *
     * @return the value of salarioBruto
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * Set the value of salarioBruto
     *
     * @param salarioBruto new value of salarioBruto
     */
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * Get the value of empleado
     *
     * @return the value of empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Set the value of empleado
     *
     * @param empleado new value of empleado
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Get the value of departamento
     *
     * @return the value of departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Set the value of departamento
     *
     * @param departamento new value of departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Get the value of empresa
     *
     * @return the value of empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Set the value of empresa
     *
     * @param empresa new value of empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
         double salarioBruto = empleado.getSueldo();
         double salarioNeto = salarioBruto - (retencion*salarioBruto)/100;
         LocalDateTime fecha = LocalDateTime.now(); 
        return "N\u00f3mina{" + "empresa=" + empresa + ", departamento=" + departamento + ", empleado=" + empleado + ", salarioBruto=" + salarioBruto + ", retencion=" + retencion + "%" + ", salarioNeto=" + salarioNeto + ", fecha=" + fecha + '}';
    } 
}
