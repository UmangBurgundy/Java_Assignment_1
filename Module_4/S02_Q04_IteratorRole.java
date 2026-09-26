import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class S02_Q04_IteratorRole {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Red");
        items.add("Green");
        items.add("Blue");
        items.add("Yellow");

        Iterator<String> it = items.iterator();
        while (it.hasNext()) {
            String color = it.next();
            if (color.equals("Green")) {
                it.remove();
            }
        }

        System.out.println(items);
    }
}
