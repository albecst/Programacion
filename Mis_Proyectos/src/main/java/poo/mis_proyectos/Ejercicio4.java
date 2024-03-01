package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n1;
        int n2;

        System.out.println("Introduce n1: ");
        n1 = entrada.nextInt();

        System.out.println("Introduce n2: ");
        n2 = entrada.nextInt();

        if (n1 == n2) {
            System.out.println("Los dos valores son iguales");
        } else if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        } else {
            System.out.println("n2 es mayor que n1");
        }
    }
}