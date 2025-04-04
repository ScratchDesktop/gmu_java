package project_2;

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
