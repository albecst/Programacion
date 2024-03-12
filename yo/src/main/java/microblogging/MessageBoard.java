package microblogging;

import microblogging.ImagePost;
import java.util.ArrayList;

public class MessageBoard {

    private ArrayList<Post> posts;

    public MessageBoard() {
        posts = new ArrayList<>();
    }

    public void addPost(Post p) {
        posts.add(p);
    }

    public int totalsize() {
        int total = 0;
        for (Post p : posts) {
            total += p.size();
        }
        return total;
    }

    public Post longerPost() {
        Post longer = posts.get(0);
        for (Post p : posts) {
            if (p.size() > longer.size()) {
                longer = p;
            }
        }
        return longer;
    }

    public Post[] getImagePosts() {
        ArrayList<Post> aux = new ArrayList<>();
        for (Post p : posts) {
            if (p instanceof ImagePost) {
                aux.add(p);
            }
        }
        Post[] aux2 = new Post[aux.size()];
        return aux.toArray(aux2);
    }
}
