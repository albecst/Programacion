package poo.pl1_castillo_toma;

import java.time.*;

public class PruebaAlquiler {

    public static void main(String[] args) {
        LocalDateTime diaHoraInicio1 = LocalDateTime.of(2024, Month.MARCH, 12,15,00,00);
        LocalDateTime diaHoraInicio2 = LocalDateTime.of(2024, Month.MARCH, 12,14,00,00);
        
        LocalDateTime diaHoraFin1 = LocalDateTime.of(2024, Month.MARCH, 12,16,00,00);
        LocalDateTime diaHoraFin2 = LocalDateTime.of(2024, Month.MARCH, 12,18,00,00);
        LocalDateTime diaHoraFin3 = LocalDateTime.of(2024, Month.MARCH, 16,18,00,00);
        
        LocalDateTime fechaCaducidad1 = LocalDateTime.of(2028, Month.JANUARY, 10, 00, 00, 00);
        LocalDateTime fechaCaducidad2 = LocalDateTime.of(2029, Month.JANUARY, 10, 00, 00, 00);
        
        Cliente cliente1 = new Cliente("Pepe", "Pepe@gmail.com", "666111222", 123456789, fechaCaducidad1);
        Cliente cliente2 = new Cliente("Jose", "Jose@gmail.com", "666222111", 987654321, fechaCaducidad2);

        
        Patin patin1 = new Patin(120, 120, "P1", "B", "LITE", 33, 15, diaHoraInicio1, cliente1, diaHoraFin1);
        Patin patin2 = new Patin(100, 140, "P2", "X", "EAR", 20, 90, diaHoraInicio2, cliente2, diaHoraFin2);
        Bicicleta bicicleta1 = new Bicicleta(140, 6, "B1", "A", "PRO", 36, 26, diaHoraInicio1, cliente1, diaHoraFin1);
        Bicicleta bicicleta2 = new Bicicleta(120, 2, "B2", "Z", "LITE", 20, 2000, diaHoraInicio1, cliente1, diaHoraFin3);
        
        Alquiler alquiler1 = new Alquiler(patin1, cliente1, diaHoraInicio1);
        System.out.println(alquiler1.CuentaAlquileres());
        
        Alquiler alquiler2 = new Alquiler(patin2, cliente2, diaHoraInicio2);        
        System.out.println(alquiler2.CuentaAlquileres());
        
        Alquiler alquiler3 = new Alquiler(bicicleta1, cliente1, diaHoraInicio1);
        System.out.println(alquiler3.CuentaAlquileres());
        
        Alquiler alquiler4 = new Alquiler(bicicleta2, cliente1, diaHoraInicio1);
        System.out.println(alquiler4.CuentaAlquileres());
        System.out.println();

        
        System.out.println(patin1.nivelCarga());
        System.out.println("El importe de " +patin1.getIdentificador()+" ha sido de: "+ patin1.calcularImporte() +"€");
        System.out.println();
        
        System.out.println(patin2.nivelCarga());
        System.out.println("El importe de " +patin2.getIdentificador()+" ha sido de: "+ patin2.calcularImporte() +"€");
        System.out.println();
        
        System.out.println(bicicleta1.nivelCarga());
        System.out.println("El importe de " + bicicleta1.getIdentificador() + " ha sido de: "+bicicleta1.calcularImporte()+"€");
        System.out.println();
        
        System.out.println(bicicleta2.nivelCarga());
        System.out.println("El importe de " + bicicleta2.getIdentificador() + " ha sido de: "+bicicleta2.calcularImporte()+"€");
                
    }
}
