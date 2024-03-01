package poo.lab_sesion3;

import java.util.Scanner;
import java.util.Locale;

public class Ejecicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Introduce el menor");
        int menor = entrada.nextInt();

        System.out.println("Introduce el mayor");
        int mayor = entrada.nextInt();

        imprimir(menor, mayor);
    }

    public static void imprimir(int menor, int mayor) {
        for (int i = menor; i <= mayor; i++) {
           es_par(i);
           espar(i);
        }
    }

    public static void es_par(int i) {
        if (i % 2 == 0) {
            System.out.print(i + " "); 
        }
    }
    
    public static boolean espar(int i) {
        return i%2==0;
    }

}
