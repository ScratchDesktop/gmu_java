import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileVader {
    public static void main(String[] args) throws AnakinException {
        String fileName = "example.txt"; 
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            // Mask IOException by throwing AnakinException
            throw new AnakinException();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new AnakinException();
            }
        }
    }
}
