import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int dia, mes, ano;
    dia = entrada.nextInt();
    mes = entrada.nextInt();
    ano = entrada.nextInt();

    if (mes <= 12){
      if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        if (dia >=1 && dia <= 31){
          System.out.println("true");
        }
        else if (dia > 31 || dia < 1){
          System.out.println("false");
        }
      }
      if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
        if (dia >= 1 && dia <= 30){
          System.out.println("true");
        }
        else if (dia > 30 || dia <1){
          System.out.println("false");
        }
      } 
      if (mes == 2){
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
          System.out.println(dia >= 1 && dia <= 29);
        } else {
            System.out.println(dia >= 1 && dia <= 28);
    }
}
    }
  }
}

    
    
  
