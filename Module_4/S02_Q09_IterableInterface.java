import java.util.Iterator;
import java.util.List;

class SimpleCollection<T> implements Iterable<T> {
    private List<T> items;

    public SimpleCollection(List<T> items) {
        this.items = items;
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}

public class S02_Q09_IterableInterface {
    public static void main(String[] args) {
        SimpleCollection<String> collection = new SimpleCollection<>(List.of("Alpha", "Beta", "Gamma"));
        for (String item : collection) {
            System.out.println(item);
        }
    }
}
