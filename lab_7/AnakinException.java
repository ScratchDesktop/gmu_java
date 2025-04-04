import java.io.IOException;

public class AnakinException extends IOException {
    @Override
    public String getMessage() {
        return "I don’t like sand.";
    }
}
