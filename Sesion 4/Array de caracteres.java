/*
Escribir un programa que reciba de entrada 10 números enteros entre el 97 y el 122 que representarán las letras del alfabeto (exceptuando la ñ), los almacene en un array de caracteres, y cuente cuantas vocales se han generado.
Nota: para pasar del código entero a carácter se utiliza: char c = (char) numero;
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner mensaje = new Scanner(System.in);
    char letras[] = new char[10];
    int cuenta = 0;
    
    for (int i = 0; i < 10; i++){
      int n = mensaje.nextInt();
      caracteres(n, letras);
      cuenta += esVocal(letras[i]);
    }
    System.out.println(cuenta);
  }

  public static char[] caracteres(int num, char letras[]){
    if (num >= 97 && num <= 122){
      char c = (char) num;
      for (int i = 0; i < 10; i++){
        letras[i] = c;
      }
    }
    return letras;
  }

  public static int esVocal(char c){
    int cuenta = 0;
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
      cuenta += 1;
    }
    return cuenta;
  }
}
