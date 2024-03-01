package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n;

        System.out.println("Introduce un número y te diré si es par o impar");
        n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es un número par");
        }
            else if (n % 2 == 1) {
                 System.out.println("Es un número impar");
            }
       }
}