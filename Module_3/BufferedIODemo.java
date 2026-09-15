import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIODemo {
    public static void main(String[] args) {
        String filename = "buffered_example.txt";

        System.out.println("--- Writing using BufferedWriter ---");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Line 1: High performance file writing using BufferedWriter.");
            bw.newLine();
            bw.write("Line 2: Buffering reduces disk I/O calls by storing blocks in memory.");
            bw.newLine();
            bw.write("Line 3: Java I/O buffering makes character stream operations very efficient.");
            bw.newLine();
            System.out.println("Successfully written lines to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing with BufferedWriter: " + e.getMessage());
            return;
        }

        System.out.println("\n--- Reading using BufferedReader ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println("[" + lineNumber + "] " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading with BufferedReader: " + e.getMessage());
        }
    }
}
