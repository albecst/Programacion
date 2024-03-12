package microblogging;

import java.util.Objects;

public class Tag {

    private String tag;
    private String language;

    public Tag(String tag, String language) {
        this.tag = tag;
        this.language = language;
    }

    @Override
    public String toString() {
        return tag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tag other = (Tag) obj;
        if (!Objects.equals(this.tag, other.tag)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        return true;
    }

}
