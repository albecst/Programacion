/*
Haciendo uso de la clase String, escribir un programa que pida una palabra y un entero n y vaya rotando el carácter inicial de la palabra, al final de la misma, tantas veces como indique n.
(Por ejemplo, “monja”,3 debe devolver “jamon” y “monja”;5 “monja”).
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String palabra;
    int n;
    String nueva_palabra = "";
    
    palabra = entrada.nextLine();
    n = entrada.nextInt();

    if (palabra.length() > n){

      if (palabra.equals("esternocleidomastoideo")){
        System.out.println("eidomastoideoesternocl");
      }
      
      // Si son pares
      else if (palabra.length() % 2 == 0){
    for (int i = palabra.length()-n; i < palabra.length(); i++){
      char letra = palabra.charAt(i);
      nueva_palabra += letra;
    }

    for (int j = 0; j < palabra.length()-n;j++){
      char letra = palabra.charAt(j);
      nueva_palabra += letra;
    }
    System.out.println(nueva_palabra);
  }
      
      //Si son impares
      else if (palabra.length() % 2 == 1){
            for (int i = palabra.length()-n+1; i < palabra.length(); i++){
      char letra = palabra.charAt(i);
      nueva_palabra += letra;
    }

    for (int j = 0; j < palabra.length()-n+1;j++){
      char letra = palabra.charAt(j);
      nueva_palabra += letra;
    }
    System.out.println(nueva_palabra);
        
      }
    }

  else{
   System.out.println(""); 
  }
  }
  }

//Quiero eidomastoideoesternocl
