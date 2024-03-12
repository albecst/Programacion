package Valentina;

import java.util.Scanner;
import java.util.Random;


public class Tablas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Random rand = new Random();
        
        int resultado = -1;
        int intento = 0;
        
        while (resultado != 0){
            if (intento > 0){
                System.out.println("Muy bien!!! Te pongo otra.");
        }
            int x = rand.nextInt(1, 5);
            int y = rand.nextInt(1, 12);
            System.out.print(x + " x " + y + " = ");
            resultado = entrada.nextInt();
            if (resultado == 0){
                break;
            }
            while (resultado != x*y){
                System.out.println("MAL. Inténtalo de nuevo");
                System.out.print(x + " x " + y + " = ");

                resultado = entrada.nextInt();
                if (resultado == 0){
                    break;
                }
            }
            intento += 1;
        
        
    }
    }
}
