import java.util.*;

public class S10_Q02_SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Math", 85);
        scores.put("Science", 95);
        scores.put("English", 75);
        scores.put("History", 90);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Original Map: " + scores);
        System.out.println("Map sorted by values: " + sortedMap);
    }
}
