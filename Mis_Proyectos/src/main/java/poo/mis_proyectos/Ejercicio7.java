package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int n;
        String cadena;
        
        System.out.println("Introduce un entero");
        n = entrada.nextInt();
        
        System.out.println("Introduce una cadena");
        cadena = entrada.nextLine();
        
        for (int i = 0; i < n; i++){
            System.out.println(cadena);
        }
        
    }

}
