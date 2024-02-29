import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      int n;
      n = entrada.nextInt();    
      
    for(int i=n; i<n+1; i++){
        for (int j=1; j<10; j++){
            System.out.println(i + "x" + j + "=" + (i*j));
        }
        System.out.println("");
    }
    }    
}
