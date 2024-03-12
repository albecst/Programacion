package microblogging;

public class ImagePost extends Post {

    private String filename;
    private int width;
    private int height;

    public ImagePost(String user, String title, String filename, int width, int height) {
        super(user, title);
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    @Override
    public int size() {
        return height / 20;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("(%dx%d)", width, height);
    }
}
