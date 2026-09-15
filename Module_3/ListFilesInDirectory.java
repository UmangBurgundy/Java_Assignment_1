import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {
    public static void listDirectory(String dirPath) {
        try {
            File dir = new File(dirPath);

            if (!dir.exists()) {
                System.err.println("Error: The path '" + dirPath + "' does not exist.");
                return;
            }

            if (!dir.isDirectory()) {
                System.err.println("Error: The path '" + dirPath + "' is a file, not a directory.");
                return;
            }

            File[] filesList = dir.listFiles();
            if (filesList == null) {
                System.err.println("Error: Unable to access contents of directory (check permissions).");
                return;
            }

            System.out.println("\nListing contents of directory: " + dir.getAbsolutePath());
            System.out.println("------------------------------------------------------------------");
            System.out.printf("%-30s | %-10s | %s%n", "Name", "Type", "Size");
            System.out.println("------------------------------------------------------------------");

            int fileCount = 0;
            int dirCount = 0;

            for (File item : filesList) {
                String type = item.isDirectory() ? "DIR" : "FILE";
                String size = item.isDirectory() ? "-" : item.length() + " bytes";
                System.out.printf("%-30s | %-10s | %s%n", item.getName(), type, size);
                if (item.isDirectory()) {
                    dirCount++;
                } else {
                    fileCount++;
                }
            }

            System.out.println("------------------------------------------------------------------");
            System.out.println("Total: " + fileCount + " file(s), " + dirCount + " directory/directories.");
        } catch (SecurityException se) {
            System.err.println("Security error: Permission denied to access directory - " + se.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String dirPath;

        if (args.length > 0 && !args[0].trim().isEmpty()) {
            dirPath = args[0];
        } else {
            System.out.print("Enter directory path (press Enter for current directory '.'): ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine().trim();
                dirPath = input.isEmpty() ? "." : input;
            } else {
                dirPath = ".";
            }
        }

        listDirectory(dirPath);
    }
}
