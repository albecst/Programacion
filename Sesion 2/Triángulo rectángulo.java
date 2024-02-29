import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    int n;
    int i;
    int j;

    n = entrada.nextInt();
    
    for (i=n ;i>0;i--){
      for(j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
    
  }
}
