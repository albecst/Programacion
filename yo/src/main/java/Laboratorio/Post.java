package Laboratorio;

import java.util.ArrayList;

abstract class Post {

    //A
    private String titulo;
    private String usuario;
    private int likes;
    private ArrayList<Tag> tagss;
    private ArrayList<String> tags;
    
    private Tag tag;

    //C
    public Post(String usuario, String titulo) {
        this.tags = new ArrayList<>();
        this.tagss = new ArrayList<>();

        this.titulo = titulo;
        this.usuario = usuario;
    }
   
    //M
    abstract int calcularLongitud();
    
    abstract String getTipo();

    
    
    public int like(){
        likes += 1;
        return likes;
    }
    
    //public void addTag(Tag tag){
      //  for (Tag elementos : this.tags){
        //    if ((elementos.getFrase().equals(tag.getFrase())) && (elementos.getIdioma().equals(tag.getIdioma()))){
          //      this.tags.add(tag);
           // }
           // else
             //   this.tags.add(tag);
           // }
        //}
    
    
    public void addTag(Tag tag) {
    // Verificar si el tag ya existe en la lista de tags
    boolean tagRepetido = false;
    for (Tag elemento : tagss) {
        if (elemento.getIdioma().equals(tag.getIdioma()) && elemento.getFrase().equals(tag.getFrase())) {
            tagRepetido = true;
            break;
        }
    }

    // Si el tag no está repetido, agregarlo a tagss y su frase a tags
    if (!tagRepetido) {
        tagss.add(tag);
        tags.add(tag.getFrase());
    } else {
        System.out.println("El tag '" + tag + "' ya existe en el post con el mismo idioma.");
    }
}

    
    
    
    
    
    //G&S
    /**
     * Get the value of likes
     *
     * @return the value of likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Set the value of likes
     *
     * @param likes new value of likes
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }


    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "[" + usuario + "]:" + titulo  + " (" + likes + " likes)=>" + tags;
    }
    
}
