import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S09_Q03_ThreadSafeCollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);

        synchronizedList.add("Thread-safe item 1");
        synchronizedList.add("Thread-safe item 2");

        synchronized (synchronizedList) {
            for (String item : synchronizedList) {
                System.out.println(item);
            }
        }
    }
}
