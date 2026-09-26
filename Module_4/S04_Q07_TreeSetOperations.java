import java.util.TreeSet;

public class S04_Q07_TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(30);
        System.out.println("TreeSet elements: " + set);

        System.out.println("Smallest element: " + set.first());
        System.out.println("Largest element: " + set.last());

        set.remove(20);
        System.out.println("After removing 20: " + set);
    }
}
