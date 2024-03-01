package lab_sesion4_5;

import java.util.*;

public class PruebaArrayList {
    public static void main(String[] args) {
        //Inicializar un array dinámico
        ArrayList <String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        System.out.println(colores.toString());
        System.out.println(colores.get(0) + colores.get(1));
        
        //Ver si hay un color
        if (colores.contains("Magenta")){
            System.out.println("Hay Magenta");
        }
        else{
            System.out.println("No hay Magenta");
        }
        
        //Ordenar alfabéticamente
        Collections.sort(colores);
        System.out.println(colores.toString());
        
    }
    
}
