// package project_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MediaLibrary {
    private List<Label<String, Media>> mediaList;

    MediaLibrary() {
        this.mediaList = new ArrayList<>();
    }

    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> label = new Label<>(name, media);

        for(Label<String, Media> existing : this.mediaList) {
            if(existing.equals(label)) {
                throw new MediaAlreadyInLibrary(name, media);
            }
        }

        mediaList.add(label);
    }

    public List<Label<String, Media>> filter(MediaFilter mediaFilter) {
        List<Label<String, Media>> filteredList = new ArrayList<>();

        for(Label<String, Media> item : mediaList) {
            if(mediaFilter.matches(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    public void sort() {
        Collections.sort(mediaList);
    }
}
