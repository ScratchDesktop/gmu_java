package project_2;

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
        if(!(other instanceof Music)) {
            throw new IllegalArgumentException("Can Only Compare Music with Music");
        }

        Music m = (Music) other;
        int year_diff = this.getYear() - m.getYear();
        if(year_diff != 0) {
            return year_diff;
        }

        return this.getArtist().compareTo(m.getArtist());
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
