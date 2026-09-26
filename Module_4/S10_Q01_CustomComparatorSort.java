import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentRecord {
    String name;
    int marks;

    public StudentRecord(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class S10_Q01_CustomComparatorSort {
    public static void main(String[] args) {
        List<StudentRecord> students = new ArrayList<>();
        students.add(new StudentRecord("Alice", 85));
        students.add(new StudentRecord("Bob", 92));
        students.add(new StudentRecord("Charlie", 78));
        students.add(new StudentRecord("Diana", 95));

        Comparator<StudentRecord> marksComparator = (s1, s2) -> Integer.compare(s1.marks, s2.marks);
        Collections.sort(students, marksComparator);
        System.out.println("Sorted by marks (ascending): " + students);

        Collections.sort(students, marksComparator.reversed());
        System.out.println("Sorted by marks (descending): " + students);
    }
}
