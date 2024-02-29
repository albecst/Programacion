import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = entrada.nextInt();

    if (n < 0){
      System.out.println("false");
    }
    
    if (n == 0){
      System.out.println("false");
    }

    if (n == 1){
      System.out.println(2);
    }

if (n > 1){
    esprimo(n);

    while (esprimo(n) != true){
      n++;
    }
    System.out.println(n);
}
   
  }  
 public static boolean esprimo(int n){
      for(int i = 2; i < n; i++){
        if(n%i == 0){
        return false;
        }
      }
       return true;
    }
}
