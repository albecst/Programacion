package microblogging;

public class TextPost extends Post {

    private String text;

    public TextPost(String user, String title, String t) {
        super(user, title);
        text = t;
    }

    @Override
    public int size() {
        return text.length() / 80 + 1;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + text.substring(0, 10) + "...";
    }
}
