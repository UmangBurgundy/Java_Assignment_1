import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {
    public static void main(String[] args) {
        String filename = "file_to_delete.txt";
        File file = new File(filename);

        try {
            if (file.createNewFile()) {
                System.out.println("Created file for deletion test: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        System.out.println("File exists before deletion: " + file.exists());

        System.out.println("Attempting to delete file...");
        boolean isDeleted = file.delete();

        if (isDeleted) {
            System.out.println("Success: File '" + file.getName() + "' was deleted successfully.");
        } else {
            System.err.println("Failed: Could not delete file '" + file.getName() + "'. Check file permissions or lock status.");
        }

        System.out.println("File exists after deletion: " + file.exists());
    }
}
