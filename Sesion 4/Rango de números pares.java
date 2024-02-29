
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int menor = entrada.nextInt();
        int mayor = entrada.nextInt();
      if(mayor > menor){
        imprimir(menor, mayor);
    }
      else{
        System.out.println("false");
      }
    }

    public static void imprimir(int menor, int mayor) {
        for (int i = menor; i <= mayor; i++) {
           es_par(i);
           espar(i);
        }
    }

    public static void es_par(int i) {
        if (i % 2 == 0) {
            System.out.println(i); 
        }
    }
    
    public static boolean espar(int mayor) {
        return mayor%2==1;
    }

}
