import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = entrada.nextInt();

    if(n == 0 || n == 1){
      System.out.println("false");
    }
    if(n<0){
      System.out.println("false");
    }
    
    if(n>1){
      if(n/2 == 1 || n/3 == 1 || n/5 == 1 || n/7 == 1 || n/11 == 1 || n/13 == 1 || n/29 == 1){
        System.out.println("true");
      }
      else if(n/2 != 1 || n/3 != 1 || n/5 != 1 || n/7 != 1 || n/11 != 1 || n/13 != 1 || n/29 != 1){
        System.out.println("false");
      }
      
    }
    
  }
}
