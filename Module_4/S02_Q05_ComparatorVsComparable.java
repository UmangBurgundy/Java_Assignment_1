import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class S02_Q05_ComparatorVsComparable {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Charlie", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));

        Collections.sort(people);
        System.out.println("Comparable (by age): " + people);

        Comparator<Person> nameComparator = (p1, p2) -> p1.name.compareTo(p2.name);
        Collections.sort(people, nameComparator);
        System.out.println("Comparator (by name): " + people);
    }
}
