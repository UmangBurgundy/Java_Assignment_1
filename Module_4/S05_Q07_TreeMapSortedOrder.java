import java.util.Map;
import java.util.TreeMap;

public class S05_Q07_TreeMapSortedOrder {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentRanks = new TreeMap<>();

        studentRanks.put("Zara", 5);
        studentRanks.put("Alice", 1);
        studentRanks.put("John", 4);
        studentRanks.put("Bob", 2);
        studentRanks.put("David", 3);

        System.out.println("Keys sorted in natural alphabetical order:");
        for (Map.Entry<String, Integer> entry : studentRanks.entrySet()) {
            System.out.println(entry.getKey() + " -> Rank " + entry.getValue());
        }
    }
}
