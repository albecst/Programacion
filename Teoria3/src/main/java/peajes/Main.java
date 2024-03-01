package peajes;

public class Main {
    public static void main(String[] args) {
        Agente a1 = new Agente("12345678A", "Valentina");
        
        Camiones cam1 = new Camiones(3, 4);
        Camiones cam2 = new Camiones(4, 4);
        
        Cabina c1 = new Cabina(cam1, a1, "1");
        
        c1.calculoPrecio(cam1);
        c1.calculoPrecio(cam2);

        c1.mostrarDatos(cam1, c1);
        c1.mostrarDatos(cam2, c1);
        
    }
    
}
