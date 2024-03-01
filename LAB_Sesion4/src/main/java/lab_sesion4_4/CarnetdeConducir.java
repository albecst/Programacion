package lab_sesion4_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CarnetdeConducir {
    /* Atributos */
    private String tipo;
    private LocalDateTime LocalDate;
    private int años;

    
    /* Constructor */

    public CarnetdeConducir(String tipo, LocalDateTime LocalDate, int años) {
        this.tipo = tipo;
        this.LocalDate = LocalDate;
        this.años = años;
    }
    
    
    /*Métodos*/
    public String fechaDeExpedición(int años){
        LocalDateTime hoy = LocalDateTime.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = hoy.plusYears(años).format(formatoCorto); 
        return fecha;
    }
    
    
    
 
    /* Get & Set*/
 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(LocalDateTime LocalDate) {
        this.LocalDate = LocalDate;
    }

    
    
    /**
     * Get the value of años
     *
     * @return the value of años
     */
    public int getAños() {
        return años;
    }

    /**
     * Set the value of años
     *
     * @param años new value of años
     */
    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return "CarnetConducir{" + "tipo=" + tipo + ", LocalDate=" + LocalDate + ", fechaDeExpedición=" + fechaDeExpedición(años) + '}';
    }
}
