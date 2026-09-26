import java.util.HashMap;
import java.util.Map;

public class S12_Q04_BookCatalogHashMap {
    private Map<String, String> catalog = new HashMap<>();

    public void addBook(String title, String author) {
        catalog.put(title, author);
        System.out.println("Added: \"" + title + "\" by " + author);
    }

    public void searchByTitle(String title) {
        if (catalog.containsKey(title)) {
            System.out.println("Found book: \"" + title + "\" - Author: " + catalog.get(title));
        } else {
            System.out.println("Book \"" + title + "\" not found in catalog.");
        }
    }

    public void displayCatalog() {
        System.out.println("Complete Book Catalog:");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" by " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        S12_Q04_BookCatalogHashMap bookCatalog = new S12_Q04_BookCatalogHashMap();

        bookCatalog.addBook("Clean Code", "Robert C. Martin");
        bookCatalog.addBook("Effective Java", "Joshua Bloch");
        bookCatalog.addBook("Design Patterns", "Erich Gamma et al.");

        bookCatalog.displayCatalog();

        bookCatalog.searchByTitle("Effective Java");
        bookCatalog.searchByTitle("Refactoring");
    }
}
