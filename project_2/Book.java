// package project_2;

public class Book extends Media {
    private String title;
    private String author;
    private String publisher;

    public Book(Format format, String isbn, String genre,
                String author, String title, String publisher) {
        super(format, isbn, genre);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public final String getTitle() {
        return title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getPublisher() {
        return publisher;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", " + super.toString();
    }

    @Override
    public int compareTo(Media other) {

        int thisPriority = Media.getMediaTypePriority(this);
        int otherPriority = Media.getMediaTypePriority(other);

        if (thisPriority != otherPriority) {
            return Integer.compare(thisPriority, otherPriority);
        }
        

        Book b = (Book) other;
        int titleCompare = this.getTitle().compareTo(b.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        }
        return this.getAuthor().compareTo(b.getAuthor());
    }
}
