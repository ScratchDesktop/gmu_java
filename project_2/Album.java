// package project_2;
import java.util.ArrayList;
import java.util.List;

public class Album extends Music {

    private List<String> trackList;

    public Album(Format format, String isbn, String genre, String artist, String title, int year, List<String> trackList) {
        super(format, isbn, genre, artist, title, year);
        this.trackList = new ArrayList<>();
        this.trackList.addAll(trackList);
    }

    public final List<String> getTrackList() {
        return trackList;
    }

    @Override
    public String getType() {
        return "Album";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tracks: " + trackList;
    }

    @Override
    public int compareTo(Media other) {
        int thisPriority = Media.getMediaTypePriority(this);
        int otherPriority = Media.getMediaTypePriority(other);
    
        if (thisPriority != otherPriority) {
            return Integer.compare(thisPriority, otherPriority);
        }
    
        if (!(other instanceof Music)) {
            return 0; 
        }
    
        Music m = (Music) other;
    
        int artistComp = this.getArtist().compareTo(m.getArtist());
        if (artistComp != 0) return artistComp;
    
        int yearComp = Integer.compare(this.getYear(), m.getYear());
        if (yearComp != 0) return yearComp;
    
        return this.getTitle().compareTo(m.getTitle());
    }
}
