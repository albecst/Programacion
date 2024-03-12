/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Peaje;

/**
 *
 * @author alber
 */
public class Pruebita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agente agente1 = new Agente("09128625W", "Paco");
        Cabina cabina1 = new Cabina(agente1);
        
        Camion camion1 = new Camion("Camion1", 4, 3.5);
        Camion camion2 = new Camion("Camion2", 6, 5);
        
        cabina1.addCamion(camion1);
        cabina1.addCamion(camion2);
        
        System.out.println(cabina1.getCamiones().toString());
        
        System.out.println(cabina1.resumen(camion1));
        System.out.println(cabina1.resumen(camion2));
        
        
        System.out.println(cabina1.getAgente().getDni());
        System.out.println(agente1.toString());
        System.out.println(cabina1.recibo());
        
        
    }
    
}
