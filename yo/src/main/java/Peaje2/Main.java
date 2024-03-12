/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Peaje2;

/**
 *
 * @author alber
 */
public class Main {

    public static void main(String[] args) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        Agente agente2 = new Agente("23456789D", "María Perez");
        //Crea las cabinas
        Cabina cabina1 = new Cabina("C1", agente1);
        Cabina cabina2 = new Cabina("C2", agente2);
        //Crea camiones
        Camion camion1 = new Camion(3,"1234-BCD",10000);
        Camion camion2 = new Camion(4,"2345-CDF",15000);
        //Crea autobuses
        Autobus bus1 = new Autobus(35,"5678-CFG", 7000);
        Autobus bus2 = new Autobus(50,"6789-DTD", 8000);
        //Cobra peajes
        
        System.out.println("Cabina 1:");
        System.out.println(cabina1.importeUnitarioCamion(camion1));
        System.out.println(cabina1.importeUnitarioAutobus(bus1));
        System.out.println(cabina1.importeTotalCamion());
        System.out.println(cabina1.importeTotalAutobuses());
        System.out.println(cabina1.importeTotal());

        System.out.println(" ");        
        System.out.println("Cabina 2:");
        
        System.out.println(cabina2.importeUnitarioCamion(camion2));
        System.out.println(cabina2.importeUnitarioAutobus(bus2));
        System.out.println(cabina2.importeTotalCamion());
        System.out.println(cabina2.importeTotalAutobuses());
        System.out.println(cabina2.importeTotal());
    }

 }
