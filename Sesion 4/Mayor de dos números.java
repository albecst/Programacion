/*
Realizar un programa que determine cuál es el mayor de dos números.
El programa tendrá un método mayor que recibirá dos valores de tipo entero y devolverá cual es el mayor. 
Desde el método main se pedirá los valores y se llamará al método mayor.
*/
  
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n1, n2;
        
        n1 = entrada.nextInt();
        
        n2 = entrada.nextInt();

        if (n1 != n2){
        System.out.println(es_mayor(n1, n2));
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
        if (n1 < n2){
            mayor = n2;
    }
        return mayor;
    }
    
}
