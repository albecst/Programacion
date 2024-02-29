/*
Escribir un programa que simule el juego de la Primitiva. 
Un módulo (método jugar) se encargará de pedir de la entrada seis enteros entre el 1 y el 49 sin repetición y los devolverá en un array, otro módulo (método sortear) con un array de seis enteros obtenidos de la entrada entre el 1 y el 49 sin repetición y por último el método comprobar dirá el número de aciertos por la salida.
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int apuesta[] = new int[6];
    int loteria[] = new int[6];
    int salir;
    
    jugar(entrada, apuesta);
    sortear(entrada, loteria);
    salir = valido(apuesta, loteria);
    if (salir == 0){
         int cuenta = comprobar(entrada, apuesta, loteria);
        System.out.println(cuenta);
    }
    if (salir == 1){
      System.out.println("0");
    }
  }

public static void jugar(Scanner entrada, int apuesta[]){
    String[] numeros = entrada.nextLine().split(",");
    for (int i = 0; i < numeros.length; i++){
      apuesta[i] = Integer.parseInt(numeros[i]);
    }
}


  public static void sortear(Scanner entrada, int loteria[]){
      String[] numeros = entrada.nextLine().split(",");
      for (int i = 0; i < 6; i++){
      loteria[i] = Integer.parseInt(numeros[i]);  
    }
    }

  public static int comprobar(Scanner entrada, int apuesta[], int loteria[]){
    int cuenta = 0;
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 6; j++){
        if(apuesta[i] == loteria[j]){
          cuenta += 1;
        }
      }
    }
    return cuenta;
  }

public static int valido(int apuesta[], int loteria[]){
    int salir = 0;
    for (int i = 0; i < 6; i++){
        if (apuesta[i] < 1 || apuesta[i] > 49){
            salir = 1;
            break;
        }
        for (int j = i+1; j < 6; j++){
            if (apuesta[i] == apuesta[j]){
                salir = 1;
                break;
            }
        }
        if (salir == 1) {
            break;
        }
    }
    return salir;
}


}
