/*
Haciendo uso de la clase String, escribir un programa que reciba un NIF con 9 caracteres (ej. 00395469F) y nos diga si la letra es correcta.
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String NIF = entrada.nextLine();
    String numeros = NIF.substring(0, NIF.length()-1);
    char letra = calculosNIF(numeros);   
    char letter = NIF.charAt(NIF.length()-1);
    
    if (letra == letter){
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }
  }
  
    
  public static char calculosNIF(String numeros){
    int resultado;
    char letra = ' ';
    int numero = Integer.parseInt(numeros);
    resultado = numero%23;

    if (resultado == 0){
      letra = 'T';
    }

    if (resultado == 1){
      letra = 'R';
    }

    if (resultado == 2){
      letra = 'W';
    }

    if (resultado == 3){
      letra = 'A';
    }

    if (resultado == 4){
      letra = 'G';
    }

    if (resultado == 5){
      letra = 'M';
    }

    if (resultado == 6){
       letra = 'Y';
    }

    if (resultado == 7){
       letra = 'F';
    }

    if (resultado == 8){
       letra = 'P';
    }

    if (resultado == 9){
       letra = 'D';
    }

    if (resultado == 10){
       letra = 'X';
    }

    if (resultado == 11){
       letra = 'B';
    }

    if (resultado == 12){
       letra = 'N';
    }

    if (resultado == 13){
       letra = 'J';
    }

    if (resultado == 14){
       letra = 'Z';
    }

    if (resultado == 15){
       letra = 'S';
    }

    if (resultado == 16){
       letra = 'Q';
    }

    if (resultado == 17){
       letra = 'V';
    }

    if (resultado == 18){
       letra = 'H';
    }

    if (resultado == 19){
       letra = 'L';
    }

    if (resultado == 20){
       letra = 'C';
    }

    if (resultado == 21){
       letra = 'K';
    }

    if (resultado == 22){
       letra = 'E';
    }
  return letra;  

  }

  
}
