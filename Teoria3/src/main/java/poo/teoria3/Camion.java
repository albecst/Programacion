package poo.teoria3;

public class Camion extends Vehiculo{
    
    private int ejes;
    private static int cuentaCamiones;

    public Camion(int ejes, double peso, String matricula) {
        super(matricula, peso);
        this.ejes = ejes;
        Cabina.agregarCamiones();
    }

    public double pagoPeaje(){
        return 5*ejes + 2*(getPeso()/1000);
    }
    
    public void mostrarInfo(){
        System.out.println("Tipo = Camion, " + this.toString() + ", Dinero peaje = " + pagoPeaje() + ", Cuenta camiones = " + getCuentaCamiones());
    }

    public int getCuentaCamiones() {
        return cuentaCamiones += 1;
    }

    public void setCuentaCamiones(int cuentaCamiones) {
        this.cuentaCamiones = cuentaCamiones;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camion{" + "ejes=" + ejes + super.toString() + '}';
    }
}
