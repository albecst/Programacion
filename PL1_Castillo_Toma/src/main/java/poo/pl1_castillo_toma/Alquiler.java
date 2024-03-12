package poo.pl1_castillo_toma;

import java.time.LocalDateTime;

public class Alquiler {
    
    //A
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDateTime horaComienzo;
    private static int cuenta;

    
    //M

    public Alquiler(Vehiculo vehiculo, Cliente cliente, LocalDateTime horaComienzo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.horaComienzo = horaComienzo;
    }

    public String CuentaAlquileres(){
        cuenta += 1;
        return "La cuenta total de alquiler/es es: "+cuenta+ " alquileres.";
    }
    

    /**
     * Get the value of horaComienzo
     *
     * @return the value of horaComienzo
     */
    public LocalDateTime getHoraComienzo() {
        return horaComienzo;
    }

    /**
     * Set the value of horaComienzo
     *
     * @param horaComienzo new value of horaComienzo
     */
    public void setHoraComienzo(LocalDateTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Get the value of vehiculo
     *
     * @return the value of vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Set the value of vehiculo
     *
     * @param vehiculo new value of vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


}
