import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
