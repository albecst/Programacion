/*
Escribir un programa que sea capaz de calcular la letra de un NIF a partir del número del DNI.
El programa debe poseer al menos un método encargado de pedir el DNI de 8 dígitos y otro que calculará la letra del NIF (se pueden añadir más métodos auxiliares). 
Al finalizar el programa se debe presentar el NIF completo con el formato: ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F. 
La letra se calculará de la siguiente forma: Se obtiene el resto de la división entera del número del DNI entre 23 y se usa la siguiente tabla para obtener la letra que corresponde, esta tabla debe estar almacenada en un array para buscar la letra por su posición.

0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String numeros = entrada.nextLine();
    
    System.out.println(numeros + "-" + calculosNIF(numeros));
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
