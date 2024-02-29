/*

Realizar un programa que se encargue de crear una matriz de 3 filas por 5 columnas que representará los sueldos de los empleados de una empresa.
En la primera fila será la entrada al programa de 5 números decimales entre 0 y 300.000 € representando los salarios brutos de los empleados, la segunda fila representará la retención de estos salarios, calculada a partir de la siguiente tabla y por último la tercera fila representará el salario neto, es decir, el salario bruto menos la retención.
Presentar por pantalla los datos de la matriz con la información de cada empleado. 
Ejemplo: Sueldo del empleado 0: SB: 40.185,83 - R: 16.074,33 - SN: 24.111,5
Los números que no sean enteros tendrán como máximo dos decimales.


    SALARIO BRUTO   	RETENCIÓN
Desde 0 € a 17.707     	24,00%       
Desde 17.708 a 33.007  	30,00%       
Desde 33.008 a 53.407  	40,00%       
Desde 53.408 a 120.000 	47,00%       
Desde 120.001 a 175.000	49,00%       
Desde 175.001 a 300.000	51,00%       

*/

import java.util.*;
import java.text.*;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double datosEmpleados[][] = new double[3][5];
    
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    symbols.setGroupingSeparator(',');

    DecimalFormat df = new DecimalFormat("0.##", symbols);
    df.setGroupingSize(3);
    df.setGroupingUsed(true);
    
    for (int j = 0; j < 5; j++){
      datosEmpleados[0][j] = entrada.nextDouble();
    }
    retencion(datosEmpleados);
    sueldoFinal(datosEmpleados);
    for(int j=0; j<5; j++){
      System.out.println("Sueldo del empleado " + j + ": SB: " + df.format(datosEmpleados[0][j]) + " - R: "+ df.format(datosEmpleados[1][j]) + " - SN: " + df.format(datosEmpleados[2][j]));
    }
  }

  public static double[][] retencion(double datosEmpleados[][]){
    double sueldo = 0;
    for (int j = 0; j < 5; j++){
      sueldo = datosEmpleados[0][j];
      if (sueldo >= 0 && sueldo <= 17707){
        datosEmpleados[1][j] = sueldo*0.24;
      }
      if (sueldo >= 17708 && sueldo <= 33007){
        datosEmpleados[1][j] = sueldo*0.3;
      }
      if (sueldo >= 33008 && sueldo <= 53407){
        datosEmpleados[1][j] = sueldo * 0.4;
      }
      if (sueldo >= 53408 && sueldo <= 120000){
        datosEmpleados[1][j] = sueldo * 0.47;
      }
      if (sueldo >= 120001 && sueldo <= 175000){
        datosEmpleados[1][j] = sueldo * 0.49;
      }
      if (sueldo >= 175001 && sueldo <= 300000){
        datosEmpleados[1][j] = sueldo * 0.51;
      }
    }
    return datosEmpleados;
  }

  public static double [][] sueldoFinal(double datosEmpleados[][]){
    double resultado;
      for(int j = 0; j < 5; j++){
        resultado = datosEmpleados[0][j] - datosEmpleados[1][j];
        datosEmpleados[2][j] = resultado;
      }
  return datosEmpleados;  
  }
}
