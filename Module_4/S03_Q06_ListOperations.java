import java.util.ArrayList;
import java.util.List;

public class S03_Q06_ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        System.out.println("After adding elements: " + list);

        list.remove("Green");
        System.out.println("After removing 'Green' by value: " + list);

        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        list.set(0, "Cyan");
        System.out.println("After replacing index 0 with 'Cyan': " + list);
    }
}
