package lab_sesion4_7;

import java.util.ArrayList;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> piezas;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = new ArrayList<>();
    }

   //Getters & Setters 

    public void addPieza(Pieza pieza) {
        this.piezas.add(pieza);
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }
    
    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", piezas=" + piezas + '}';
    }

    
}
