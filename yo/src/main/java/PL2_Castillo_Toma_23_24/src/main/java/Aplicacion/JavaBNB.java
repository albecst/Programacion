package Aplicacion;

import Logica.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;

public class JavaBNB {
    
    //Atributos
    private ArrayList<Inmueble> inmueblesDisponibles;

    //Constructor
    public JavaBNB(ArrayList<Inmueble> inmueblesDisponibles) {
        this.inmueblesDisponibles = inmueblesDisponibles;
    }

    //Métodos
    //1º: Método para buscar inmuebles disponibles según la ciudad y fechas de entrada y salida
    public ArrayList<Inmueble> buscarInmuebles(String ciudad, LocalDate fechaEntrada, LocalDate fechaSalida) {
        ArrayList<Inmueble> inmueblesDisponiblesEnCiudad = new ArrayList<>();
        
        if (inmueblesDisponibles != null && !inmueblesDisponibles.isEmpty()) {
            for (Inmueble inmueble : this.inmueblesDisponibles) {
                if (inmueble.getDireccion().getCiudad().equalsIgnoreCase(ciudad) &&
                    inmueble.estaDisponible(fechaEntrada, fechaSalida)) {
                    inmueblesDisponiblesEnCiudad.add(inmueble);
                }
            }
        }

        return inmueblesDisponiblesEnCiudad;
    }

    //2º: Método para ordenar los inmuebles por precio de menor a mayor
    public void ordenarPorPrecioAsc() {
        if (inmueblesDisponibles != null) {
            Collections.sort(inmueblesDisponibles, Comparator.comparingDouble(Inmueble::getPrecioNoche));
        }
    }
   
    //3º: Método para ordenar los inmuebles por precio de mayor a menor
    public void ordenarPorPrecioDesc() {
        if (inmueblesDisponibles != null) {
            Collections.sort(inmueblesDisponibles, Comparator.comparingDouble(Inmueble::getPrecioNoche).reversed());
        }
    }
    
    //4º: Método para ordenar los inmuebles por tipo (Casa primero, luego Apartamento)
    public void ordenarPorTipo() {
        if (inmueblesDisponibles != null) {
            Collections.sort(inmueblesDisponibles, Comparator.comparing(Inmueble::getTipo));
        }
    }

    //5º: Método para ordenar los inmuebles por calificación de menor a mayor
    public void ordenarPorCalificacionAsc() {
        if (inmueblesDisponibles != null) {
            Collections.sort(inmueblesDisponibles, Comparator.comparingDouble(Inmueble::getCalificacion));
        }
    }
    
    //6º: Método para ordenar los inmuebles por calificación de mayor a menor
    public void ordenarPorCalificacionDesc() {
        if (inmueblesDisponibles != null) {
            Collections.sort(inmueblesDisponibles, Comparator.comparingDouble(Inmueble::getCalificacion).reversed());
        }
    }
    
    //7º: Método para calcular precio en total
    public double calcularPrecioTotal(Inmueble inmueble, LocalDate fechaEntrada, LocalDate fechaSalida){
        long diasEstancia = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
    /*XXX no me da tiempo a más*/
    }
    
    
}
