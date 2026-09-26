import java.util.TreeSet;

public class S04_Q03_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);
        numbers.add(7);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
