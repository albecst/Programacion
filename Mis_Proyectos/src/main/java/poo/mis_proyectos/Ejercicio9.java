package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n;

        System.out.println("Introduce un número entero");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
