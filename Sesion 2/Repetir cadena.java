import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);

    int n;
    String cadena;
    int i;
    String a;

    
    n = entrada.nextInt();

    entrada.nextLine();
    
    cadena = entrada.nextLine();
    a = "false";
    
    if (n >= 0){  
      for(i=0; i < n; i++){
        System.out.println(cadena);
    }
    }
    
    if (n<0){
      System.out.println(a);
    }
      
    }
    
  }
