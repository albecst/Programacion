/*
Haciendo uso de la clase String, escribir un programa que solicite una cadena y una letra y nos devuelva las posiciones que ocupa esa letra en la cadena.
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String palabra;
    char letra;
    
    palabra = entrada.nextLine();
    letra = entrada.next().charAt(0);

    if (palabra.length() > 1){
      for (int i = 0; i < palabra.length(); i++){
        if (palabra.charAt(i) == letra){
          System.out.print(i+1 + ", ");
      }
    }
  }
    else{
      System.out.println("false");
    }
  }
}
