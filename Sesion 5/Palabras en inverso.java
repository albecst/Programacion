/*
Haciendo uso de la clase StringTokenizer, escribir un programa que pida una cadena y la divida en palabras y presente las palabras en orden inverso.
Consejo: Utilizar la clase StringBuilder (paso).
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    

    String frase = entrada.nextLine();
    StringTokenizer st = new StringTokenizer(frase, " ");
    int cuenta = st.countTokens();

    if(cuenta != 0){
    String palabritas[] = new String[cuenta];

    for (int i = 0; i < cuenta; i++){
      palabritas[i] = st.nextToken();
    }

    String clave = palabritas[0];
    
    if (clave.length() > 1){
      for (int i = cuenta-1; i >= 0; i--){
        System.out.print(palabritas[i] + " ");
    }
    }
    else{
      System.out.println("");
    }
    }
    else{
      System.out.println("");
    }
  }
}
