import java.util.PriorityQueue;

public class S07_Q01_PriorityQueuePurpose {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("PriorityQueue retrieves elements based on priority (natural order / min-heap by default):");
        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());
        }
    }
}
