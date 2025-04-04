// package project_2;

public class Music extends Media {
    
    private String artist;
    private String title;
    private int year;

    Music(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre);
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public String getType() {
        return "Music";
    }

    @Override
    public int compareTo(Media other) {
        int thisPriority = Media.getMediaTypePriority(this);
        int otherPriority = Media.getMediaTypePriority(other);
    
        if (thisPriority != otherPriority) {
            return Integer.compare(thisPriority, otherPriority);
        }
    
        Music m = (Music) other;
    
        int artistComp = this.getArtist().compareTo(m.getArtist());
        if (artistComp != 0) return artistComp;
    
        int yearComp = Integer.compare(this.getYear(), m.getYear());
        if (yearComp != 0) return yearComp;
    
        return this.getTitle().compareTo(m.getTitle());
    }

    public final String getArtist() {
        return artist;
    }

    public final String getTitle() {
        return title;
    }

    public final int getYear() {
        return year;
    }

}
