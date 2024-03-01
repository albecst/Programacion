package poo.teoria3;

public class Teoria3 {

    public static void main(String[] args) {
        Autobus autobus1 = new Autobus(20, 4000, "1234ABC");
        Camion camion1 = new Camion(5, 3000, "1234BCD");
        Agente agente1 = new Agente("12345678A", "Valentina");
        Cabina cabina1 = new Cabina("1", agente1);
        
        // Pago de peajes y mostrar información
        System.out.println("Dinero peaje Autobus: " + autobus1.pagoPeaje());
        System.out.println("Dinero peaje Camion: " + camion1.pagoPeaje());
        autobus1.mostrarInfo();
        camion1.mostrarInfo();
        
        // Mostrar total de vehículos
        cabina1.totalVehiculos();
    }
}