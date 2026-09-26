import java.util.HashMap;
import java.util.Hashtable;

public class S05_Q05_HashtableVsHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "NullKeyAllowed");
        hashMap.put("Key1", null);
        System.out.println("HashMap allows null keys and null values: " + hashMap);

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("SafeKey", "ThreadSafeValue");
        System.out.println("Hashtable is synchronized, legacy, and forbids null keys/values: " + hashtable);

        try {
            hashtable.put(null, "ThrowsException");
        } catch (NullPointerException e) {
            System.out.println("Hashtable threw NullPointerException on null key");
        }
    }
}
