package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int x1;
        int y1;
        int x2;
        int y2;
        double pendiente;
        
        System.out.println("\n Introduce x1: ");
        x1 = entrada.nextInt();
        
        System.out.println("\n Introduce x2: ");
        x2 = entrada.nextInt();
        
        System.out.println("Introduce y1: ");
        y1 = entrada.nextInt();
        
        System.out.println("Introduce y2: ");
        y2 = entrada.nextInt();
        
        pendiente = (y2-y1)/(x2-x1);
        System.out.println("La pendiente es: " + pendiente + " m");
    }

}
