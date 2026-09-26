import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class S11_Q05_MergePriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.offer(40);
        pq1.offer(10);
        pq1.offer(30);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.offer(25);
        pq2.offer(5);
        pq2.offer(50);

        PriorityQueue<Integer> mergedPq = new PriorityQueue<>(pq1);
        mergedPq.addAll(pq2);

        List<Integer> sortedList = new ArrayList<>();
        while (!mergedPq.isEmpty()) {
            sortedList.add(mergedPq.poll());
        }

        System.out.println("Merged and sorted elements from both PriorityQueues: " + sortedList);
    }
}
