// 14. Writing to a File Using Byte Stream
// Writes the string "Java I/O Streams Example" to a file named output.txt using FileOutputStream.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
    public static void main(String[] args) {
        String filename = "output.txt";
        String content = "Java I/O Streams Example";

        System.out.println("Writing string to " + filename + " using FileOutputStream...");

        // Write using FileOutputStream (byte stream)
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Successfully wrote " + bytes.length + " bytes to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Verify by reading back the file contents
        System.out.println("Verifying content of " + filename + ":");
        try (FileInputStream fis = new FileInputStream(filename)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error verifying file: " + e.getMessage());
        }
    }
}
