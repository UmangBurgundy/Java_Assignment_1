import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S02_Q02_CollectionFrameworkFeatures {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Consistent API Architecture");
        list.add("Reduced Programming Effort");
        list.add("High Performance Data Structures");
        list.add("Built-in Sorting and Searching Algorithms");

        Collections.sort(list);
        for (String feature : list) {
            System.out.println("- " + feature);
        }
    }
}
