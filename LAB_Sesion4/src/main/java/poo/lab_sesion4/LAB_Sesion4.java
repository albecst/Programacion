package poo.lab_sesion4;

public class LAB_Sesion4 {

    public static void main(String[] args) {
        PruebaVehiculos2 v1 = new PruebaVehiculos2("1234 FCD", "Opel", "Astra", 0, false, 4, "Rojo");
        PruebaVehiculos2 v2 = new PruebaVehiculos2("2345 GDT", "BMW", "S1", 0, false, 5, "Azul");
        PruebaVehiculos2 v3 = new PruebaVehiculos2("3456 HVF", "Audi", "A3", 0, true, 1, "Verde");

        
        v1.setMarcha(3);
        v2.setMarcha(3);
        v1.setColor("Negro");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        
    }
}
