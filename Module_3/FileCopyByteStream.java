import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByteStream {
    public static void copyFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (!sourceFile.exists()) {
            System.err.println("Error: Source file does not exist: " + sourcePath);
            return;
        }

        System.out.println("Copying from: " + sourceFile.getAbsolutePath());
        System.out.println("Copying to  : " + destFile.getAbsolutePath());

        byte[] buffer = new byte[1024];
        int bytesRead;
        long totalBytesCopied = 0;

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("File copy successful! Total bytes copied: " + totalBytesCopied);
        } catch (IOException e) {
            System.err.println("Error during file copy: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String source = "copy_source.txt";
        String destination = "copy_destination.txt";

        File srcFile = new File(source);
        if (!srcFile.exists()) {
            try (FileOutputStream fos = new FileOutputStream(srcFile)) {
                String initialData = "Java Byte Stream File Copy Demonstration.\n" +
                                     "FileInputStream reads bytes from source and FileOutputStream writes them to destination.\n" +
                                     "Timestamp: " + System.currentTimeMillis();
                fos.write(initialData.getBytes());
                System.out.println("Created test source file: " + source);
            } catch (IOException e) {
                System.err.println("Failed to create sample source file: " + e.getMessage());
                return;
            }
        }

        copyFile(source, destination);
    }
}
