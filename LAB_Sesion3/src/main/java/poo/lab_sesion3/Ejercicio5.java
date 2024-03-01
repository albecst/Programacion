package poo.lab_sesion3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double n1, n2;
        char simbolo;
        
        System.out.println("Introduce n1");
        n1 = entrada.nextDouble();
        
        System.out.println("Introduce simbolo");
        simbolo = entrada.next().charAt(0);
        
        System.out.println("Introduce n2");
        n2 = entrada.nextDouble();
        
        System.out.println(calculadora(n1, n2, simbolo));
    }
    
    public static double calculadora(double n1, double n2, char simbolo){
        double resultado = 0;
        switch(simbolo){
            case '+':
                resultado = n1 + n2;
                break;
            
            case '-':
                resultado = n1 - n2;
                break;
                
            case '*':
                resultado = n1 * n2;
                break;
                
            case '/':
                resultado = n1 / n2;
                break;
                
            case '%':
                resultado = n1%n2;
                break;
            
            default: resultado = 0;
        }
        return resultado;
    }
}
