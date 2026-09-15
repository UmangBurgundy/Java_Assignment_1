// 15. Reading a File Using Character Stream
// Reads a file using FileReader class and prints the contents to the console.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamRead {
    public static void main(String[] args) {
        String filename = "sample_char_input.txt";
        File file = new File(filename);

        // Ensure sample file exists for demonstration
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
        // Read using FileReader (character stream)
        try (FileReader reader = new FileReader(file)) {
            int charData;
            while ((charData = reader.read()) != -1) {
                // Character stream reads 16-bit characters directly
                System.out.print((char) charData);
            }
            System.out.println("\n--- End of File ---");
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
    }
}
