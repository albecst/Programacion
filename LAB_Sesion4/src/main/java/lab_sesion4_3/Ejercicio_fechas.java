package lab_sesion4_3;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ejercicio_fechas {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("La fecha de hoy completa es: " + hoy);
        
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm");
        System.out.println("Hoy es:  (formatoCorto)" + hoy.format(formatoCorto));
    }
    
}
