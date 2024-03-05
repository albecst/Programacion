/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio;

/**
 *
 * @author alber
 */
public class TextPost extends Post {
    
    //A
    private String texto;
    private String tipo = "texto";

    //C
    public TextPost(String usuario, String titulo, String texto) {
        super(usuario, titulo);
        this.texto = texto;
        this.tipo = "texto";
    }
    
    //M
    
    @Override
    public int calcularLongitud(){
        int caracteres = this.toString().length();
        return caracteres/80;
    }
    
     /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    
    @Override
    public String getTipo() {
        return "texto";
    }

    
    /**
     * Get the value of texto
     *
     * @return the value of texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Set the value of texto
     *
     * @param texto new value of texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ texto + '.';
    }


    
}
