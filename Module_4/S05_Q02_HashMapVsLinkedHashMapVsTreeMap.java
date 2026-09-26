import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class S05_Q02_HashMapVsLinkedHashMapVsTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        String[] keys = {"Zebra", "Apple", "Mango", "Cat"};
        for (String k : keys) {
            hashMap.put(k, 1);
            linkedHashMap.put(k, 1);
            treeMap.put(k, 1);
        }

        System.out.println("HashMap keys (no order guarantee): " + hashMap.keySet());
        System.out.println("LinkedHashMap keys (insertion order): " + linkedHashMap.keySet());
        System.out.println("TreeMap keys (natural sorted order): " + treeMap.keySet());
    }
}
