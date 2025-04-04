// package project_2;

public class SearchFilter implements MediaFilter {
    private String searchTerm;

    public SearchFilter(String searchTerm) {
        this.searchTerm = searchTerm.toLowerCase(); 
    }

    @Override
    public boolean matches(Label<String, Media> item) {
        String labelKey = item.getKey().toLowerCase();
        String media = item.getValue().toString().toLowerCase();

        return labelKey.contains(searchTerm) || media.contains(searchTerm);
    }
}
