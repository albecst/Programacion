/* Escribir un programa que reciba de entrada 20 números enteros entre el 1 y el 500, los almacene en un array, los ordene y a continuación genere un array de caracteres que contenga una ‘p’ en las posiciones donde hay números pares y una ‘i’ en los impares. 
Mostrar el contenido de ambos arrays en filas de 10 elementos formados por pares de número y letra. Ejemplo:

5 i - 9 i - 13 i - 18 p - 19 i - 20 p - 23 i - 34 p - 42 p - 44 p -

46 p - 63 i - 76 p - 77 i - 80 p - 81 i - 89 i - 94 p - 97 i - 100 p -
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];
        char[] letras = new char[20];

        // Leer los números y almacenarlos en el array
        for (int i = 0; i < 20; i++) 
        {
            numeros[i] = entrada.nextInt();
        }

        // Ordenar el array de números
        Arrays.sort(numeros);

        // Generar el array de letras (p o i)
        for (int i = 0; i < 20; i++) 
        {
            letras[i] = esPar(numeros[i]) ? 'p' : 'i';
        }

        // Mostrar ambos arrays en filas de 10 elementos
        for (int i = 0; i < 20; i++) 
        {
            System.out.print(numeros[i] + " " + letras[i] + " - ");
            if ((i + 1) % 10 == 0) 
            {
                System.out.println();
                System.out.println();// Salto de línea cada 10 elementos
            }
        }
    }

    // Función para verificar si un número es par
    public static boolean esPar(int num) {
        return (num % 2 == 0);
    }
}
