// package project_2;

public abstract class Media implements Comparable<Media> {
    private String isbn;
    private String genre;
    private Format format;

    public Media(Format format, String isbn, String genre) {
        this.format = format;
        this.isbn = isbn;
        this.genre = genre;
    }

    public final String getISBN() {
        return isbn.toUpperCase();
    }

    public final String getGenre() {
        return genre;
    }

    public final Format getFormat() {
        return format;
    }

    public abstract String getType(); 

    // Assuming We have a bunch of diffeerent media types, we must define a priority for each type.
    // This is a static method that returns the priority of the media type.
    protected static int getMediaTypePriority(Media media) {
        if (media instanceof Book) return 1;
        if (media instanceof Movie) return 2;
        if (media instanceof Series) return 3;
        if (media instanceof Music) return 4;
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Media) {
            Media other = (Media) obj;
            return this.getISBN().equals(other.getISBN());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", ISBN: " + getISBN() +
               ", Genre: " + getGenre() + ", Format: " + getFormat();
    }

    public abstract int compareTo(Media other);
}
