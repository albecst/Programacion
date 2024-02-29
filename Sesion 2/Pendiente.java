import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1, y1, x2, y2;
        double pendiente;

        x1 = entrada.nextDouble();

        y1 = entrada.nextDouble();

        x2 = entrada.nextDouble();

        y2 = entrada.nextDouble();

        // Calcula la pendiente
        pendiente = (y2 - y1) / (x2 - x1);

        System.out.println(pendiente);
    }
}
