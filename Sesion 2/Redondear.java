import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);

    int resultado;
    double numero;

    numero = entrada.nextDouble();
    resultado = (int)(numero + 0.5);
    System.out.println(resultado);
  }
}
