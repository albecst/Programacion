package poo.lab_sesion4_2;

public class EjercicioLampara {
    public static void main(String[] args) {
        Lampara lampara1 = new Lampara(true, 50, 11.5);
        Lampara lampara2 = new Lampara(false, 10, 0);
        
        System.out.println(lampara1.toString());
        System.out.println(lampara2.toString());

    }
    
}
