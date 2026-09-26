import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S04_Q01_SetVsList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item1");

        Set<String> set = new HashSet<>();
        set.add("Item1");
        set.add("Item1");

        System.out.println("List permits duplicates and ordered by index: " + list);
        System.out.println("Set permits only unique elements without index: " + set);
    }
}
