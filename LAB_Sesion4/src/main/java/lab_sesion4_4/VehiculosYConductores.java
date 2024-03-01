package lab_sesion4_4;

import java.time.LocalDateTime;

public class VehiculosYConductores {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        
        Vehiculo v1 = new Vehiculo("0000ABC", "Ford", "Focus", 100, true);
        CarnetdeConducir carnet = new CarnetdeConducir("B", hoy, 4);
        Conductor c1 = new Conductor("12345678Z", "Pedro", "B", carnet);
        v1.setConductor(c1);

        System.out.println(v1.toString());
        
        
    }
    
}
