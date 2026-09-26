import java.util.WeakHashMap;

public class S12_Q03_WeakHashMapGCDemo {
    public static void main(String[] args) {
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        weakMap.put(key1, "Active Session 1");
        weakMap.put(key2, "Active Session 2");

        System.out.println("Before garbage collection, map size: " + weakMap.size());

        key1 = null;

        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {}

        System.out.println("After key1 set to null and GC called, map size: " + weakMap.size());
        System.out.println("Remaining entries in WeakHashMap: " + weakMap.values());
    }
}
