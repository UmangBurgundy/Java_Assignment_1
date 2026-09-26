import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S03_Q07_ListPerformanceComparison {
    public static void main(String[] args) {
        int count = 50000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(0, i);
        }
        long arrayListAdd = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(0, i);
        }
        long linkedListAdd = System.nanoTime() - start;

        System.out.println("Add at beginning - ArrayList: " + (arrayListAdd / 1_000_000) + " ms, LinkedList: " + (linkedListAdd / 1_000_000) + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        long arrayListRemove = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        long linkedListRemove = System.nanoTime() - start;

        System.out.println("Remove from middle (1000 ops) - ArrayList: " + (arrayListRemove / 1_000_000) + " ms, LinkedList: " + (linkedListRemove / 1_000_000) + " ms");

        start = System.nanoTime();
        long sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        long arrayListIterate = System.nanoTime() - start;

        start = System.nanoTime();
        sum = 0;
        for (int num : linkedList) {
            sum += num;
        }
        long linkedListIterate = System.nanoTime() - start;

        System.out.println("Iteration - ArrayList: " + (arrayListIterate / 1_000_000) + " ms, LinkedList: " + (linkedListIterate / 1_000_000) + " ms");
    }
}
