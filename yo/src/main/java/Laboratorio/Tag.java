package Laboratorio;

public class Tag {
    
    //A
    private final String frase;
    private final String idioma;

    //C

    public Tag(String frase, String idioma) {
        this.frase = frase;
        this.idioma = idioma;
    }
    
    
    //M
    
    //G
    /**
     * Get the value of idioma
     *
     * @return the value of idioma
     */
    public String getIdioma() {
        return idioma;
    }
    /**
     * Get the value of frase
     *
     * @return the value of frase
     */
    public String getFrase() {
        return frase;
    }
}
