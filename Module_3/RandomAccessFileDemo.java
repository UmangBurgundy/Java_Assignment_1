import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        String filename = "random_access_demo.txt";
        File file = new File(filename);

        if (file.exists()) {
            file.delete();
        }

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            System.out.println("--- 1. Writing initial data at position 0 ---");
            String initialText = "Hello World! Java I/O Streams and Multithreading.";
            raf.writeBytes(initialText);
            System.out.println("Initial data written: \"" + initialText + "\"");
            System.out.println("Current file pointer position: " + raf.getFilePointer());
            System.out.println("Current file length: " + raf.length() + " bytes");

            System.out.println("\n--- 2. Seeking to position 6 and overwriting ---");
            raf.seek(6);
            System.out.println("File pointer moved to: " + raf.getFilePointer());
            raf.writeBytes("Earth");
            System.out.println("Overwrote 5 bytes with 'Earth'. New pointer: " + raf.getFilePointer());

            System.out.println("\n--- 3. Reading entire file from beginning (position 0) ---");
            raf.seek(0);
            byte[] bytes = new byte[(int) raf.length()];
            raf.readFully(bytes);
            String resultText = new String(bytes);
            System.out.println("Updated File Content: \"" + resultText + "\"");

            System.out.println("\n--- 4. Appending to end of file ---");
            raf.seek(raf.length());
            raf.writeBytes(" [APPENDED DATA]");

            raf.seek(0);
            byte[] allBytes = new byte[(int) raf.length()];
            raf.readFully(allBytes);
            System.out.println("Final File Content: \"" + new String(allBytes) + "\"");

        } catch (IOException e) {
            System.err.println("I/O Error with RandomAccessFile: " + e.getMessage());
        }
    }
}
