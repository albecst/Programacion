/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pl1_castillo_toma;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author alber
 */
public class Patin extends Vehiculo {

    //A
    private int velocidadMaxima;
    private int pesoMaximo;

    //C

    public Patin(int velocidadMaxima, int pesoMaximo, String identificador, String marca, String modelo, int capacidad, int cargaActual, LocalDateTime fechaEntrada, Cliente cliente, LocalDateTime fechaSalida) {
        super(identificador, marca, modelo, capacidad, cargaActual, fechaEntrada, cliente, fechaSalida);
        this.velocidadMaxima = velocidadMaxima;
        this.pesoMaximo = pesoMaximo;
    }
    
    
    
    //M
    @Override
     public double calcularImporte() {
        
        long minutosTranscurridos = ChronoUnit.MINUTES.between(this.getFechaEntrada(), this.getFechaSalida());
        System.out.println("En el vehículo "+ this.getIdentificador() + ",han pasado "+minutosTranscurridos+" minutos");
        tarifa = 0.1*minutosTranscurridos;
        return tarifa;
    }

    
    
    
    
    //G&S

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
}
