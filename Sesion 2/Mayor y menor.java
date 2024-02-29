import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n1, n2;

    n1 = entrada.nextInt();
    n2 = entrada.nextInt();

    if (n1 > n2){
      System.out.println(n1 + " es mayor que " + n2);
    }

    else if (n1 == n2){
      System.out.println("Son iguales");  
    }

    else if (n1 < n2){
      System.out.println(n1 + " es menor que " + n2);
    }
    
  }
}
