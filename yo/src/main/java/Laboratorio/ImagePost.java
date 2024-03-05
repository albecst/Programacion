package Laboratorio;

public class ImagePost extends Post{
    
    //A
    private String imagen;
    private int ancho;
    private int alto;
    private String tipo = "imagen";

    //C

    public ImagePost(String usuario, String titulo, String imagen, int ancho, int alto) {
        super(usuario, titulo);
        this.imagen = imagen;
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = "imagen";
    }   
    
    
    @Override
    public int calcularLongitud(){
        return alto/20;
    }
    
    //M
    
    
    //G&S
    /**
     * Get the value of alto
     *
     * @return the value of alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Set the value of alto
     *
     * @param alto new value of alto
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

        
    @Override
    public String getTipo() {
        return "imagen";
    }
    
    
    
    /**
     * Get the value of imagen
     *
     * @return the value of imagen
     */
    public String getImagen() {
        return imagen;
        
    }
    /**
     * Get the value of ancho
     *
     * @return the value of ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Set the value of ancho
     *
     * @param ancho new value of ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    /**
     * Set the value of imagen
     *
     * @param imagen new value of imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + ancho +"x"+ alto + ')';
    }

    
}
