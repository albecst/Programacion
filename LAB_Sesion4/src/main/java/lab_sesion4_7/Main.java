/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_sesion4_7;

/**
 *
 * @author alber
 */
public class Main {

    public static void main(String[] args) {
        Taller taller = new Taller("Taller 1", "123456789", 40);
        Vehiculo vehiculo = new Vehiculo("1234ABC", "Marca", "Modelo");
        vehiculo.addPieza(new Pieza("Pieza 1", 100));
        vehiculo.addPieza(new Pieza("Pieza 2", 200));
        double costeReparacion = taller.repararVehiculo(vehiculo, 2);
        System.out.println("El coste de la reparación es: " + costeReparacion);
    }
}