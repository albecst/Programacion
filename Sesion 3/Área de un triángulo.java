import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Double a,b,c;
    Double area;
    a = entrada.nextDouble();
    b = entrada.nextDouble();
    c = entrada.nextDouble();

    if (a+b>c){
      if(a+c>b){
        if(c+b>a){
          area = (a*b)/2;
          System.out.println(area);
        }
      else{
        System.out.println("false");
      }
      }
    else{
      System.out.println("false");
    }
    }
  else{
    System.out.println("false");
    
  }
  }
}
