import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = entrada.nextInt();
    int resultado = 1;
    
    for(int i=n;i > 0;i--){
      resultado *= i;
    }
    System.out.println(resultado);
  }
}
