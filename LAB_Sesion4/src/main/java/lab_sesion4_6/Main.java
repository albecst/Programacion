package lab_sesion4_6;
import lab_sesion4_6.nominas.Nomina;

public class Main {
    public static void main(String[] args) {
        // Creación de la empresa
        Empresa e1 = new Empresa("Indra", "1234567");

        // Creación de los departamentos
        Departamento d1 = new Departamento("Informática", "1", "Madrid", e1);
        Departamento d2 = new Departamento("Personal", "2", "Barcelona", e1);

        // Creación de los empleados asignados a los departamentos
        Empleado emp1 = new Empleado("12345678Z", "Pepe", 25, "soltero", 1500,
                "programador", d1);
        Empleado emp2 = new Empleado("45673419T", "Laura", 35, "casada", 2000,
                "analista", d1);
        Empleado emp3 = new Empleado("56782345F", "Marta", 40, "casada", 2500,
                "gBerente", d2);

        //Nominas
        Nomina nomina1 = new Nomina(e1, d1, emp1, 21);
        
        System.out.println(nomina1.toString());
        // Impresión de los elementos del ArrayList
        System.out.println("Empleados departamento: " + d1.getEmpleados().toString());
    }
}