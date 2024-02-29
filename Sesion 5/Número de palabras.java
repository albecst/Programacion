/*
Haciendo uso de la clase StringTokenizer, escribir un programa que lea una frase y nos diga cuántas palabras la componen.
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   String frase = entrada.nextLine();
   String lista[] = frase.split(" ");
   String palabra = lista[0];

    if (palabra.length() > 0){
    int n = lista.length;
    System.out.println(n);
    for(int i = 0; i < n; i++){
      System.out.println(lista[i]);
    }
    }
    else{
      System.out.println("0");
    }
  }
}
