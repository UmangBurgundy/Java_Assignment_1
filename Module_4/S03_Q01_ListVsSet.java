import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S03_Q01_ListVsSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Python");

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("Python");

        System.out.println("List allows duplicates and preserves index: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Set stores only unique elements without index: " + set);
    }
}
