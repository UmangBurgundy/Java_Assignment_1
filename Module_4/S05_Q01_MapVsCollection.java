import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class S05_Q01_MapVsCollection {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("Single Item 1");
        col.add("Single Item 2");

        Map<String, String> map = new HashMap<>();
        map.put("US", "United States");
        map.put("IN", "India");

        System.out.println("Collection stores individual elements: " + col);
        System.out.println("Map stores key-value pairs: " + map);
    }
}
