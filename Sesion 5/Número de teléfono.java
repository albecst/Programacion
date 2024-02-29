/*
Haciendo uso de la clase StringTokenizer, escribir un programa al que se le pasa un número de teléfono de la forma: 91-8885566.
El programa deberá usar la clase StringTokenizer (no la he usado xd) para extraer el código de la comunidad y el resto del número, convertir el código de la comunidad en int y el resto en long, y presentarlo por pantalla.*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String numero = entrada.nextLine();
    String separador[] = numero.split("-");
    System.out.println("Prefijo: " + separador[0] + " resto: " + separador[1]);
  }
}
