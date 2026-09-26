import java.util.Map;
import java.util.TreeMap;

public class S05_Q04_TreeMapSortingKeys {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(90, "Alice");
        scores.put(75, "Bob");
        scores.put(88, "Charlie");
        scores.put(60, "Diana");

        for (Map.Entry<Integer, String> entry : scores.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }
}
