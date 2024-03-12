package microblogging;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Post {

    private String user;
    private String title;
    private int likes;
    private ArrayList<Tag> tags;

    public Post(String user, String title) {
        this.likes = 0;
        this.user = user;
        this.title = title;
        tags = new ArrayList<>();
    }

    public void like() {
        this.likes++;
    }

    public int getLikes() {
        return likes;
    }

    public String getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public Tag[] getTags() {
        return (Tag[]) tags.toArray();
    }

    public void addTag(Tag tag) {
        if (!tags.contains(tag)) {
            tags.add(tag);
        }
    }

    public abstract int size();

    @Override
    public String toString() {
        return String.format("[%s]:%s (%d likes)=>%s", this.user, this.title,
                this.likes, Arrays.toString(tags.toArray()));
    }

}
