import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class S07_Q03_BlockingQueueVsPriorityQueue {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        System.out.println("PriorityQueue (unbounded, not thread-safe, priority-sorted): " + pq.poll());

        BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
        bq.put("Message 1");
        bq.put("Message 2");
        System.out.println("BlockingQueue (bounded, thread-safe, blocking put/take): " + bq.take());
    }
}
