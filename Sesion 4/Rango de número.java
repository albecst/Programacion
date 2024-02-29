import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int menor = entrada.nextInt();

        int mayor = entrada.nextInt();

        imprimir(menor, mayor);
    }

    public static void imprimir(int menor, int mayor) {
        if (menor < mayor){
        for (int i=menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }   else{
            System.out.print("false");
        }
    }
}
