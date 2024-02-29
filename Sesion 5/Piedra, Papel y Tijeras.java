/*
Escribir un programa para simular el juego “piedra, papel, tijeras”, es un juego para dos jugadores que se juega con las manos y que simula los tres elementos. 
Las reglas a seguir son las siguientes:

Piedra gana a tijeras, la piedra aplasta a las tijeras.
Papel gana a piedra, el papel envuelve a la piedra.
Tijeras gana a papel, las tijeras cortan el papel.
Si ambos jugadores sacan el mismo elemento hay empate.
Para comprobar el resultado del juego utilizaremos la siguiente tabla, donde -1 pierde, 0 empata y 1 gana:


USUARIO/ORDENADOR	PIEDRA [0]	PAPEL [1]	TIJERAS [2]
Piedra [0]       	0         	-1       	1          
Papel [1]        	1         	0        	-1         
Tijeras [2]      	-1        	1        	0          
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] resultados = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
        };

        int eleccionUsuario = scanner.nextInt();
        int eleccionOrdenador = scanner.nextInt();
      
        int resultado = resultados[eleccionUsuario][eleccionOrdenador];

        if (resultado == 1) {
            System.out.println(1);
        } else if (resultado == -1) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
