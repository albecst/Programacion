package Laboratorio;

import java.util.ArrayList;

public class MessageBoard {

    //A
    private Post post;
    private ArrayList<Post> posts;
    private ArrayList<Post> img;
    //C
    public MessageBoard() {
        this.posts = new ArrayList<>();
        this.img =  new ArrayList<>();

    }

    //M
    
    public void addPost(Post post) {
        this.posts.add(post);
            }
    
    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void addImagePost(Post post) {
        if ("imagen".equals(post.getTipo())) { // Usar equals() para comparar cadenas
            this.img.add(post);
    }
}

    
    public ArrayList<Post> getImagePosts(){
        return img;
            
    }
    
    
    
    public long totalsize(){
        long longitud = 0;
        for (Post hola : posts){
            longitud += hola.calcularLongitud();
        }
        return longitud;
    }
    
    public Post longerPost(){
        int tamaño = 0;
        int mayor = 0;
        for (Post hola : posts){
            int aux = (int) hola.calcularLongitud();
            if (aux > tamaño){
                mayor = posts.indexOf(hola);
            }
        }
        return posts.get(mayor);
    }

    //G&S 
    /**
     * Get the value of post
     *
     * @return the value of post
     */
    public Post getPost() {
        return post;
    }

    /**
     * Set the value of post
     *
     * @param post new value of post
     */
    public void setPost(Post post) {
        this.post = post;
    }

}
