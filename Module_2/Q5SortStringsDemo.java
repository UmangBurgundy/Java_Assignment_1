import java.util.ArrayList;
import java.util.List;

public class Q5SortStringsDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original List: " + fruits);

        fruits.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted List (Descending): " + fruits);
    }
}