// package project_2;
import java.util.ArrayList;
import java.util.List;

public class Series extends Media {
    private String title;
    private List<String> cast;
    private List<String> episodes;

    public Series(Format format, String isbn, String genre, String title,
                  List<String> cast, List<String> episodes) {
        super(format, isbn, genre);
        this.title = title;
        this.cast = new ArrayList<>();
        this.cast.addAll(cast);
        this.episodes = new ArrayList<>();
        this.episodes.addAll(episodes);
    }

    public final String getTitle() {
        return title;
    }

    public final List<String> getCast() {
        return cast;
    }

    public final List<String> getEpisodes() {
        return episodes;
    }

    @Override
    public String getType() {
        return "Series";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", " + super.toString();
    }

    @Override
    public int compareTo(Media other) {
        int thisPriority = Media.getMediaTypePriority(this);
        int otherPriority = Media.getMediaTypePriority(other);

        if (thisPriority != otherPriority) {
            return Integer.compare(thisPriority, otherPriority);
        }

        Series s = (Series) other;
        return this.getTitle().compareTo(s.getTitle());
    }

}
