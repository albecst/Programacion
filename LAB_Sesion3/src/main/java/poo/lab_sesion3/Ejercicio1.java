package poo.lab_sesion3;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {

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
        for (int i=menor; i <= mayor; i++) {
            System.out.print(i +" ");
        }
    }

}
