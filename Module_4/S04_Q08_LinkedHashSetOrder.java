import java.util.Iterator;
import java.util.LinkedHashSet;

public class S04_Q08_LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Tokyo");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");

        System.out.println("LinkedHashSet preserves insertion order:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
