import java.util.HashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class S04_Q05_EqualsAndHashCodeInSet {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));

        System.out.println("Set size after adding duplicate student: " + students.size());
        System.out.println("Students in set: " + students);
    }
}
