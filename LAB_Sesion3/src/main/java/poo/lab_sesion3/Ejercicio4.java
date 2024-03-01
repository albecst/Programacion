package poo.lab_sesion3;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n1, n2, n3;
        int mayor;
        
        System.out.println("Introduce un número");
        n1 = entrada.nextInt();
        
        System.out.println("Introduce otro número");
        n2 = entrada.nextInt();
        
        System.out.println("Introduce otro otro número");
        n3 = entrada.nextInt();
        
        mayor = es_mayor(n1, n2);
        System.out.println("El número mayor es: " + es_mayor(mayor, n3));
    }
    
    public static int es_mayor(int n1, int n2){
        int mayor = 0;
        if (n1 > n2){
            mayor = n1;
        }
        else {
            mayor = n2;
        }
        return mayor;
    }
    
    public static int es_mayor3(int mayor, int n3){
        if (mayor > n3){
            return mayor;
        }
        else{
            return n3;
        }
    }
    
}
