import java.util.Map;
import java.util.TreeMap;

public class S11_Q04_StudentGradesTreeMap {
    private TreeMap<String, String> gradeBook = new TreeMap<>();

    public void addGrade(String student, String grade) {
        gradeBook.put(student, grade);
        System.out.println("Added/Updated: " + student + " -> " + grade);
    }

    public void removeStudent(String student) {
        if (gradeBook.containsKey(student)) {
            gradeBook.remove(student);
            System.out.println("Removed: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    public void queryGrade(String student) {
        if (gradeBook.containsKey(student)) {
            System.out.println(student + "'s Grade: " + gradeBook.get(student));
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    public void displayAll() {
        System.out.println("All Student Grades (Alphabetical):");
        for (Map.Entry<String, String> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        S11_Q04_StudentGradesTreeMap book = new S11_Q04_StudentGradesTreeMap();

        book.addGrade("Charlie", "B+");
        book.addGrade("Alice", "A");
        book.addGrade("Bob", "A-");

        book.displayAll();

        book.queryGrade("Alice");

        book.removeStudent("Charlie");

        book.displayAll();
    }
}
