import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamRead {
    public static void main(String[] args) {
        String filename = "sample_char_input.txt";
        File file = new File(filename);

        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Hello from Character Stream!\nThis text is being read using FileReader.\nUnicode Support: \u2714 Java Multithreading & I/O.");
                System.out.println("Created sample file: " + filename);
            } catch (IOException e) {
                System.err.println("Error creating sample file: " + e.getMessage());
                return;
            }
        }

        System.out.println("\n--- Reading file using FileReader ---");

        try (FileReader reader = new FileReader(file)) {
            int charData;
            while ((charData = reader.read()) != -1) {

                System.out.print((char) charData);
            }
            System.out.println("\n--- End of File ---");
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
    }
}
