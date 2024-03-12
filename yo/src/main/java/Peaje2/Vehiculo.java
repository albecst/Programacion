package Peaje2;

public class Vehiculo {
 
    //A
    private String matricula;
    private int peso_kg;


    //C
    public Vehiculo(String matricula, int peso_kg) {
        this.matricula = matricula;
        this.peso_kg = peso_kg;
    }
    
    
    
    //G&S
    /**
     * Get the value of peso_kg
     *
     * @return the value of peso_kg
     */
    public int getPeso_kg() {
        return peso_kg;
    }

    /**
     * Set the value of peso_kg
     *
     * @param peso_kg new value of peso_kg
     */
    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
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
    
}
