/*Realizar un programa que determine cuál es el mayor de tres números, pero reutilizando el método mayor de dos números.*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n1, n2, n3;
        int mayor;
        
        n1 = entrada.nextInt();
        
        n2 = entrada.nextInt();
        
        n3 = entrada.nextInt();

      if (n1 != n2 && n2 != n3 && n1 != n3){
        mayor = es_mayor(n1, n2);
        System.out.println(es_mayor(mayor, n3));
    }
      else{
        System.out.println("false");
      }
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
