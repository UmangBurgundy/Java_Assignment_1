import java.util.*;

public class S02_Q12_PrintCollectionGeneric {
    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Queue<Double> queue = new LinkedList<>(Arrays.asList(1.1, 2.2, 3.3));

        printCollection(list);
        printCollection(set);
        printCollection(queue);
    }
}
