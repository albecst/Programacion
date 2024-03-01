package yo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoy.plusYears(2).format(formatoCorto)); 

    }
    
}
