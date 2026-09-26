import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S09_Q04_UnmodifiableListDemo {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Read-Only 1");
        mutableList.add("Read-Only 2");

        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("Unmodifiable list content: " + unmodifiableList);

        try {
            unmodifiableList.add("New Item");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: modification attempt rejected.");
        }
    }
}
