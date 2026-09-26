import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class S08_Q04_ConcurrentHashMapModification {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Processing: " + key + " -> " + map.get(key));
            map.put("Four", 4);
        }

        System.out.println("No ConcurrentModificationException thrown. Final map: " + map);
    }
}
