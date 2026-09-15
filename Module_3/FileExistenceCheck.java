// 18. File Existence Check
// Checks if a file exists in the system. If it does not exist, creates it using File class.

import java.io.File;
import java.io.IOException;

public class FileExistenceCheck {
    public static void main(String[] args) {
        String filepath = "test_file_check.txt";
        File file = new File(filepath);

        System.out.println("Checking existence of file: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("File ALREADY exists!");
            System.out.println("File Name: " + file.getName());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("Is Writable: " + file.canWrite());
        } else {
            System.out.println("File does NOT exist. Attempting to create new file...");
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File successfully created at: " + file.getAbsolutePath());
                } else {
                    System.out.println("File could not be created.");
                }
            } catch (IOException e) {
                System.err.println("An error occurred while creating the file: " + e.getMessage());
            }
        }
    }
}
