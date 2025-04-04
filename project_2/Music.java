// package project_2;

public abstract class Music extends Media {
    
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
    public abstract int compareTo(Media other);

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
