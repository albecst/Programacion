/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pl1_castillo_toma;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static poo.pl1_castillo_toma.Vehiculo.tarifa;

/**
 *
 * @author alber
 */
public class Bicicleta extends Vehiculo {
    
    //A
    private int autonomia;
    private int marchas;
    

    
    //C
     public Bicicleta(int autonomia, int marchas, String identificador, String marca, String modelo, int capacidad, int cargaActual, LocalDateTime fechaEntrada, Cliente cliente, LocalDateTime fechaSalida) {
        super(identificador, marca, modelo, capacidad, cargaActual, fechaEntrada, cliente, fechaSalida);
        this.autonomia = autonomia;
        this.marchas = marchas;
    }

    //M
    @Override
    public double calcularImporte() {
        long minutosTranscurridos = ChronoUnit.MINUTES.between(this.getFechaEntrada(), this.getFechaSalida());
        System.out.println("En el vehículo "+ this.getIdentificador() + ",han pasado "+minutosTranscurridos+" minutos");

        tarifa = 0.2*minutosTranscurridos;
        return tarifa;
    }
    
    //G&S
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    
    
}