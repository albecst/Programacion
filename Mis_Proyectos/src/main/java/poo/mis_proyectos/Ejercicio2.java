package poo.mis_proyectos;
import java.util.Locale; 
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double radio;
        double longitud;
        double pi = Math.PI;
        double area;
        
        System.out.println("\n Introduce el radio (en metros): ");
        radio = entrada.nextDouble();
        
        longitud = 2*pi * radio;
        area = pi*Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: "+ longitud + " m");
        System.out.println("El área de la circunferencia es: " + area + " m2");
    }

}
