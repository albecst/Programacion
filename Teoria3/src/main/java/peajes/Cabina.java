package peajes;

public class Cabina {
    
    //Atributos//
    private String id;
    private Camiones camiones;
    private Agente agente;
    private int totalRecibos;
    private int totalCamiones;
    private int camions;
    private int reciboos;
    
    //Constructor//
    public Cabina(Camiones camiones, Agente agente, String id) {
        this.camiones = camiones;
        this.agente = agente;
        this.id = id;
        this.camions = 0;
        this.reciboos = 0;
    }
    
    //Metodos//
    public double calculoPrecio(Camiones camiones) {
        double precio = camiones.getEjes()*5 + camiones.getPeso()*2;
        this.camions++;
        this.reciboos++;
        return precio;
    }
    
    public void mostrarDatos(Camiones camiones, Cabina cabina){
        System.out.println("Cabina con id: " + id + " # " + agente.toString());
        System.out.println(camiones.toString() + " - El peaje ha costado = " + calculoPrecio(camiones) + "€");
        System.out.println(cabina.toString());
    }
    
    
    //Getters & Setters
    /**
     * Get the value of totalCamiones
     *
     * @return the value of totalCamiones
     */
    public int getTotalCamiones() {
        return totalCamiones;
    }

    /**
     * Set the value of totalCamiones
     *
     * @param totalCamiones new value of totalCamiones
     */
    public void setTotalCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
    }

    /**
     * Get the value of totalRecibos
     *
     * @return the value of totalRecibos
     */
    public int getTotalRecibos() {
        return totalRecibos;
    }

    /**
     * Set the value of totalRecibos
     *
     * @param totalRecibos new value of totalRecibos
     */
    public void setTotalRecibos(int totalRecibos) {
        this.totalRecibos = totalRecibos;
    }

    
    public Agente getAgente() {
        return agente;
    }
    
    public void setAgente(Agente agente) {
        this.agente = agente;
    }


    /**
     * Get the value of camiones
     *
     * @return the value of camiones
     */
    public Camiones getCamiones() {
        return camiones;
    }

    /**
     * Set the value of camiones
     *
     * @param camiones new value of camiones
     */
    public void setCamiones(Camiones camiones) {
        this.camiones = camiones;
    }

    @Override
    public String toString() {
        return "Cabina{" + "camion=" + camiones + ", agente=" + agente + "TotalCamiones="+ camions + '}';
    }

}
