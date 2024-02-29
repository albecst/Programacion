import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada estándar
        Scanner entrada = new Scanner(System.in);

        // Leer la entrada mientras haya más datos disponibles
        while (entrada.hasNext()) {
            String linea = entrada.nextLine(); // Leer una línea completa
            System.out.println(linea); // Imprimir la línea leída sin modificarla
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}
