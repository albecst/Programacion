package poo.teoria3;

public class Autobus extends Vehiculo {
   
    private int pasajeros;
    private static int cuentaAutobuses;
   
    public Autobus(int pasajeros, double peso, String matricula) {
        super(matricula, peso);
        this.pasajeros = pasajeros;
        Cabina.agregarAutobus();
    }

    public double pagoPeaje(){
       return 1*pasajeros + 5*(getPeso()/1000);
    }
    
    public int getCuentaAutobuses(){
        return cuentaAutobuses += 1;
    }
    
    public void mostrarInfo(){
        System.out.println("Tipo = Autobús, " + toString() + ", Dinero peaje = "+ pagoPeaje() + ", Cuenta autobuses = " + getCuentaAutobuses());
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Autobus{" + "pasajeros=" + pasajeros + super.toString()+'}';
    }
    
}