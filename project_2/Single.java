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
}
