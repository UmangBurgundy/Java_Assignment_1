import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class S02_Q07_CollectionVsMap {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Element 1");
        collection.add("Element 2");

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Value 101");
        map.put(102, "Value 102");

        System.out.println("Collection values: " + collection);
        System.out.println("Map key-value pairs: " + map);
    }
}
