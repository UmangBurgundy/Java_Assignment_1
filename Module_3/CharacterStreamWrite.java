// 16. Writing to a File Using Character Stream
// Writes a string to a file named example.txt using the FileWriter class.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamWrite {
    public static void main(String[] args) {
        String filename = "example.txt";
        String message = "This text is written using Java's FileWriter character stream.\n" +
                         "Character streams automatically handle character encodings such as UTF-8.";

        System.out.println("Writing to " + filename + " using FileWriter...");

        // Write using FileWriter (character stream)
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(message);
            System.out.println("Successfully written content to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing with FileWriter: " + e.getMessage());
            return;
        }

        // Verify and display file contents
        System.out.println("\n--- Verifying content of " + filename + " ---");
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
