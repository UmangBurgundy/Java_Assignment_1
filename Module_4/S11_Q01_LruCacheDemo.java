import java.util.LinkedHashMap;
import java.util.Map;

class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class S11_Q01_LruCacheDemo {
    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println("Cache initialized: " + cache);

        cache.get(1);
        System.out.println("Accessed key 1: " + cache);

        cache.put(4, "D");
        System.out.println("Added key 4 (evicts least recently used key 2): " + cache);
    }
}
