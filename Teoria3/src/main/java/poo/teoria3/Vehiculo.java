package poo.teoria3;

public class Vehiculo {
    
    //A
    private String matricula;
    private double peso;

    //C
    public Vehiculo(String matricula, double peso) {
        this.matricula = matricula;
        this.peso = peso;
    }
    
    
    //G&S
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
     * Get the value of matricula
     *
     * @return the value of matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Set the value of matricula
     *
     * @param matricula new value of matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", peso=" + peso + '}';
    }

}
