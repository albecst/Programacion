/*
Haciendo uso de la clase String, escribir un programa que nos diga cuantas veces se repiten cada una de las vocales en una cadena que el usuario introduce por teclado.
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int cuentaa = 0, cuentae = 0, cuentai = 0, cuentao = 0, cuentau = 0;
    char vocales[] = {'a', 'e', 'i', 'o', 'u'};
    String palabra = entrada.nextLine();
    char letra;

    for (int i = 0; i < palabra.length(); i++){
      if ('a' == palabra.charAt(i)){
        cuentaa += 1;
      }
      if ('e' == palabra.charAt(i)){
        cuentae += 1;
      }
      if ('i' == palabra.charAt(i)){
        cuentai += 1;
      }
      if ('o' == palabra.charAt(i)){
        cuentao += 1;
      }
      if ('u' == palabra.charAt(i)){
        cuentau += 1;
      }
      
    
    }
    System.out.println('a' + "," +cuentaa);
    System.out.println('e' + "," + cuentae);
    System.out.println('i' + "," + cuentai);
    System.out.println('o' + "," + cuentao);
    System.out.println('u' + "," + cuentau);
  }
}
