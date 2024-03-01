package poo.mis_proyectos;

import java.util.Locale;
import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int resultado;
        double numero;
        
        System.out.println("\n Introduce un número real");
        numero = entrada.nextDouble();
        resultado = (int)(numero + 0.5);
        System.out.println("Redondeando, el resultado es " + resultado);
    }
}