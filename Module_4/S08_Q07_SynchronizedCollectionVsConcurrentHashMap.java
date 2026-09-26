import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class S08_Q07_SynchronizedCollectionVsConcurrentHashMap {
    public static void main(String[] args) {
        Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
        syncMap.put("Key1", "Value1");

        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Key1", "Value1");

        System.out.println("Collections.synchronizedMap locks the entire map for every read/write operation.");
        System.out.println("ConcurrentHashMap achieves high concurrency by locking only individual buckets.");
        System.out.println("Synchronized Map: " + syncMap);
        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}
