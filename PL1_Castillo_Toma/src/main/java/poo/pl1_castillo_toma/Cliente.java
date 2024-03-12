/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pl1_castillo_toma;

import java.time.LocalDateTime;

/**
 *
 * @author alber
 */
public class Cliente {
  
    //A
    private String nombre;
    private String correo;
    private String telefono;
    private long tarjetaCredito;
    private LocalDateTime fechaCaducidad;
    
    //C
    public Cliente(String nombre, String correo, String telefono, long tarjetaCredito, LocalDateTime fechaCaducidad) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.tarjetaCredito = tarjetaCredito;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    
    //M
    
    //G&S
    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public LocalDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    /**
     * Get the value of tarjetaCredito
     *
     * @return the value of tarjetaCredito
     */
    public long getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Set the value of tarjetaCredito
     *
     * @param tarjetaCredito new value of tarjetaCredito
     */
    public void setTarjetaCredito(long tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    
    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
}
