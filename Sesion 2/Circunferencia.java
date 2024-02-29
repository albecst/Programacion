import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);

    double pi = Math.PI;
    double Longitud;
    double Área;
    int radio;

    radio = entrada.nextInt();
    
    Longitud = 2*pi*radio;
    Área = pi*radio*radio;
    System.out.println("Longitud: " + Longitud + "\nÁrea: " + Área);
      
  }
}
