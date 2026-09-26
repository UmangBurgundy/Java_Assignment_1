import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }

    public boolean remove(K key, V value) {
        List<V> values = map.get(key);
        if (values != null) {
            boolean removed = values.remove(value);
            if (values.isEmpty()) {
                map.remove(key);
            }
            return removed;
        }
        return false;
    }

    public void display() {
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class S12_Q01_MultiMapDemo {
    public static void main(String[] args) {
        MultiMap<String, String> multiMap = new MultiMap<>();

        multiMap.put("Fruits", "Apple");
        multiMap.put("Fruits", "Banana");
        multiMap.put("Fruits", "Mango");
        multiMap.put("Vegetables", "Carrot");
        multiMap.put("Vegetables", "Spinach");

        multiMap.display();

        System.out.println("Fruits list: " + multiMap.get("Fruits"));

        multiMap.remove("Fruits", "Banana");
        System.out.println("After removing Banana from Fruits:");
        multiMap.display();
    }
}
