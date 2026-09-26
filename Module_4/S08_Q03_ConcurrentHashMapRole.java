import java.util.concurrent.ConcurrentHashMap;

public class S08_Q03_ConcurrentHashMapRole {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);

        map.compute("A", (k, v) -> v + 10);
        map.putIfAbsent("C", 3);

        System.out.println("ConcurrentHashMap achieves thread safety via bucket-level locks and CAS operations:");
        System.out.println(map);
    }
}
