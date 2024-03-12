package poo.pl1_castillo_toma;

import java.time.LocalDateTime;
import java.time.Duration;


public abstract class Vehiculo {
    
    //A
    private String identificador;
    private String marca;
    private String modelo;
    private int capacidad;
    private int cargaActual;
    private LocalDateTime fechaEntrada;
    protected static double tarifa;
    private Cliente cliente;
    private LocalDateTime fechaSalida;

    //C
    public Vehiculo(String identificador, String marca, String modelo, int capacidad, int cargaActual, LocalDateTime fechaEntrada, Cliente cliente, LocalDateTime fechaSalida) {
        this.identificador = identificador;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.cargaActual = cargaActual;
        this.fechaEntrada = fechaEntrada;
        this.cliente = cliente;
        this.fechaSalida = fechaSalida;
    }
    
   
    //M
    public abstract double calcularImporte();
    
    public long calcularMinutosTranscurridos() {
        Duration duracion = Duration.between(fechaEntrada, fechaSalida);
        return duracion.toMinutes();
    }


    
    
    public String nivelCarga(){
        String cadena = null;
        if (this.getCargaActual() > 0 && this.getCargaActual() <= 25){
            cadena = "Nivel de carga de este dispositivo: Nivel Bajo ("+this.getCargaActual()+"%)";
        }
        else if (this.getCargaActual() > 25 && this.getCargaActual() <= 75){
            cadena = "Nivel de carga de este dispositivo: Nivel Medio (" + this.getCargaActual()+"%)";
        }
        else if (this.getCargaActual() > 75 && this.getCargaActual() <= 100){
            cadena = "Nivel de carga de este dispositivo: Nivel Alto (" + this.getCargaActual()+"%)";
        }
        else{
            cadena = "No es un nivel de batería válido, introduzca bien el número por favor.";
        }
        return cadena;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    //G&S
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
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
     * Get the value of fechaEntrada
     *
     * @return the value of fechaEntrada
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Set the value of fechaEntrada
     *
     * @param fechaEntrada new value of fechaEntrada
     */
    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    
    /**
     * Get the value of cargaActual
     *
     * @return the value of cargaActual
     */
    public int getCargaActual() {
        return cargaActual;
    }

    /**
     * Set the value of cargaActual
     *
     * @param cargaActual new value of cargaActual
     */
    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }


    /**
     * Get the value of capacidad
     *
     * @return the value of capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Set the value of capacidad
     *
     * @param capacidad new value of capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Get the value of identificador
     *
     * @return the value of identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Set the value of identificador
     *
     * @param identificador new value of identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}
