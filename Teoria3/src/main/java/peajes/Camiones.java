package peajes;

public class Camiones {

    //Atributos//
    private int ejes;
    private double peso;

    //Constructor//
    public Camiones(int ejes, double peso) {
        this.ejes = ejes;
        this.peso = peso;
    }
    
    //Getter & Setter//
    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Set the value of peso
     *
     * @param peso new value of peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Get the value of ejes
     *
     * @return the value of ejes
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * Set the value of ejes
     *
     * @param ejes new value of ejes
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camiones{" + "ejes=" + ejes + ", peso=" + peso + '}';
    }
    
}
