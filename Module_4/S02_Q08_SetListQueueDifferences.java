import java.util.*;

public class S02_Q08_SetListQueueDifferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        System.out.println("List (duplicates allowed): " + list);

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple");
        System.out.println("Set (duplicates removed): " + set);

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue (FIFO order): " + queue);
    }
}
