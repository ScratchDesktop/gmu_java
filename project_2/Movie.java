// package project_2;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private String title;
    private String director;
    private int year;
    private List<String> cast;

    public Movie(Format format, String isbn, String genre,
                 String title, String director, int year, List<String> cast) {
        super(format, isbn, genre);
        this.title = title;
        this.director = director;
        this.year = year;
        this.cast = new ArrayList<>();
        this.cast.addAll(cast);
    }

    // Final getters
    public final String getTitle() {
        return title;
    }

    public final String getDirector() {
        return director;
    }

    public final int getYear() {
        return year;
    }

    public final List<String> getCast() {
        return cast;
    }

    @Override
    public String getType() {
        return "Movie";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Year: " + getYear() + ", " + super.toString();
    }

    @Override
    public int compareTo(Media other) {
        int thisPriority = Media.getMediaTypePriority(this);
        int otherPriority = Media.getMediaTypePriority(other);

        if (thisPriority != otherPriority) {
            return Integer.compare(thisPriority, otherPriority);
        }

        Movie m = (Movie) other;
        int titleComp = this.getTitle().compareTo(m.getTitle());
        if (titleComp != 0) return titleComp;

        return Integer.compare(this.getYear(), m.getYear());
    }
}
