import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
    
  int n = 12;
  double resultado = 0;
  
  int litrosint[] = new int[n];
  double preciodouble[] = new double[n];
    
  for(int i = 0; i<n; i++){
    int x = entrada.nextInt();
    litrosint[i] = x;
    
    double y = entrada.nextDouble();
    preciodouble[i] = y;
  }
 
    for( int k=0; k<n; k++){
      resultado += (litrosint[k] * preciodouble[k]);
  }
    System.out.println(resultado);
    
  }
}
