import java.util.HashMap;
import java.util.WeakHashMap;

public class S07_Q05_WeakHashMapRole {
    public static void main(String[] args) {
        HashMap<String, String> standardMap = new HashMap<>();
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();

        String key1 = new String("standardKey");
        String key2 = new String("weakKey");

        standardMap.put(key1, "StandardValue");
        weakMap.put(key2, "WeakValue");

        System.out.println("Standard map before GC: " + standardMap);
        System.out.println("Weak map before GC: " + weakMap);

        key1 = null;
        key2 = null;

        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {}

        System.out.println("WeakHashMap uses weak references for keys, enabling automatic garbage collection:");
        System.out.println("Standard map after key nullified: " + standardMap.size());
        System.out.println("Weak map after key nullified and GC: " + weakMap.size());
    }
}
