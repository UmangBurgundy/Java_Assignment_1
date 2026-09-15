import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamRead {
    public static void main(String[] args) {
        String filename = "sample_byte_input.txt";
        File file = new File(filename);

        if (!file.exists()) {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                String sampleData = "Hello from Byte Stream! Reading file byte-by-byte using FileInputStream.\nLine 2: Java I/O streams are versatile.";
                fos.write(sampleData.getBytes());
                System.out.println("Created sample file: " + filename);
            } catch (IOException e) {
                System.err.println("Error creating sample file: " + e.getMessage());
                return;
            }
        }

        System.out.println("\n--- Reading file using FileInputStream ---");

        try (FileInputStream fis = new FileInputStream(file)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {

                System.out.print((char) byteData);
            }
            System.out.println("\n--- End of File ---");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
