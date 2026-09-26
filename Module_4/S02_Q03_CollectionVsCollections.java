import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class S02_Q03_CollectionVsCollections {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(50);
        collection.add(10);
        collection.add(30);

        List<Integer> list = (List<Integer>) collection;
        Collections.sort(list);
        int max = Collections.max(list);

        System.out.println("Collection as List: " + list);
        System.out.println("Max element from Collections utility: " + max);
    }
}
