
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int h;
        int m;
        int s;

        h = entrada.nextInt();
        m = entrada.nextInt();
        s = entrada.nextInt();

        if (s + 1 == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
            m = 0;
            s = 0;
        }

            
        
        System.out.println("[" + h + ":" + m + ":" + s + "]");
    }

}
