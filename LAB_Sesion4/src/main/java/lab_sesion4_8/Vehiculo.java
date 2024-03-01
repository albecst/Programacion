package lab_sesion4_8;

import java.time.LocalDateTime;


public class Vehiculo {
    
    //Atributos
    private String matricula;
    private LocalDateTime horaEntrada;
    private boolean abono;

    //Constructor
    public Vehiculo(String matricula, LocalDateTime horaEntrada, boolean abono) {
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
        this.abono = abono;
    }
    
    //Getters & Setters
    /**
     * Get the value of abono
     *
     * @return the value of abono
     */
    public boolean isAbono() {
        return abono;
    }

    /**
     * Set the value of abono
     *
     * @param abono new value of abono
     */
    public void setAbono(boolean abono) {
        this.abono = abono;
    }


    /**
     * Get the value of horaEntrada
     *
     * @return the value of horaEntrada
     */
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * Set the value of horaEntrada
     *
     * @param horaEntrada new value of horaEntrada
     */
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
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
