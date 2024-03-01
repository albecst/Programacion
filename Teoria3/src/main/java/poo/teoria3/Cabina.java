package poo.teoria3;

public class Cabina {

    private String id;
    private Agente agente;
    private static int cuentaAutobuses;
    private static int cuentaCamiones;

    public Cabina(String id, Agente agente) {
        this.id = id;
        this.agente = agente;
    }

    public void totalVehiculos(){
        int total = cuentaAutobuses + cuentaCamiones;
        System.out.println("Se han cobrado a " + total + " vehiculos");
    }

    public static void agregarAutobus(){
        cuentaAutobuses++;
    }
    
    public static void agregarCamiones(){
        cuentaCamiones++;
    }
    
    
    
    
    
    
    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getCuentaAutobuses() {
        return cuentaAutobuses;
    }

    public static void setCuentaAutobuses(int cuentaAutobuses) {
        Cabina.cuentaAutobuses = cuentaAutobuses;
    }

    public static int getCuentaCamiones() {
        return cuentaCamiones;
    }

    public static void setCuentaCamiones(int cuentaCamiones) {
        Cabina.cuentaCamiones = cuentaCamiones;
    }

    @Override
    public String toString() {
        return "Cabina{" + "id=" + id + ", agente=" + agente + '}';
    }
}
