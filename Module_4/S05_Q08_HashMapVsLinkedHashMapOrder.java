import java.util.HashMap;
import java.util.LinkedHashMap;

public class S05_Q08_HashMapVsLinkedHashMapOrder {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        String[] fruits = {"Watermelon", "Banana", "Apple", "Orange", "Grape"};
        for (int i = 0; i < fruits.length; i++) {
            hashMap.put(fruits[i], i + 1);
            linkedHashMap.put(fruits[i], i + 1);
        }

        System.out.println("HashMap keys (order not guaranteed): " + hashMap.keySet());
        System.out.println("LinkedHashMap keys (exact insertion order): " + linkedHashMap.keySet());
    }
}
