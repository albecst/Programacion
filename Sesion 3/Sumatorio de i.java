import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = entrada.nextInt();
    int resultado = 0;
    
    for(int i = 0; i <= n;i++){
      resultado += i;
    }

    System.out.println(resultado);
  }
}
