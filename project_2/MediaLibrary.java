// package project_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MediaLibrary {
    private List<Label<String, Media>> library;

    public MediaLibrary() {
        this.library = new ArrayList<>();
    }

    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> label = new Label<>(name, media);

        for(Label<String, Media> existing : this.library) {
            if(existing.equals(label)) {
                throw new MediaAlreadyInLibrary(name, media);
            }
        }

        library.add(label);
    }

    public List<Label<String, Media>> filter(MediaFilter mediaFilter) {
        List<Label<String, Media>> filteredList = new ArrayList<>();

        for(Label<String, Media> item : library) {
            if(mediaFilter.matches(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    public void sort() {
        Collections.sort(library);
    }
}
