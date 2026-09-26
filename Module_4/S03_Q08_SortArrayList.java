import java.util.ArrayList;
import java.util.Collections;

public class S03_Q08_SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        Collections.sort(fruits);
        System.out.println("Alphabetical order: " + fruits);

        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Reverse alphabetical order: " + fruits);
    }
}
