import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n;

    n = entrada.nextInt();

    if (n%2 == 0){
      System.out.println("par");
    }

    else if(n%2 == 1){
      System.out.println("impar");
    }
    
  }
}
