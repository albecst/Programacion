/* Realizar un programa que permita simular una calculadora. 
El programa tendrá un método calculadora que recibirá dos valores de tipo double y un carácter que indicará la operación a realizar (+,-,*,/). 
Desde el método main se pedirá al usuario los valores y la operación y se llamará al método calculadora. */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double n1, n2;
        char simbolo;
        
        n1 = entrada.nextDouble();
        
        
        n2 = entrada.nextDouble();

        simbolo = entrada.next().charAt(0);

      
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
