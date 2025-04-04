// package project_2;

public class Single extends Music {

    public Single(Format format, String isbn, String genre,
                  String artist, String title, int year) {
        super(format, isbn, genre, artist, title, year);
    }

    @Override
    public String getType() {
        return "Single";
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
