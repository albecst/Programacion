package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int h;
        int m;
        int s;

        System.out.println("Introduce la h: ");
        h = entrada.nextInt();

        System.out.println("Introduce los m: ");
        m = entrada.nextInt();

        System.out.println("Introduce los s: ");
        s = entrada.nextInt();

        if (s + 1 == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
            m = 0;
            s = 0;
        }
        
        else {
            s++;
            
        }
        System.out.println(h + ":" + m + ":" + s);
    }

}
