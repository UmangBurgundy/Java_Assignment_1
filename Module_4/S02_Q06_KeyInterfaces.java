import java.util.*;

public class S02_Q06_KeyInterfaces {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("List maintains insertion order");

        Set<String> set = new HashSet<>();
        set.add("Set ensures unique elements");

        Queue<String> queue = new LinkedList<>();
        queue.add("Queue operates FIFO");

        Map<String, String> map = new HashMap<>();
        map.put("Key", "Map maps keys to values");

        System.out.println(list);
        System.out.println(set);
        System.out.println(queue);
        System.out.println(map);
    }
}
