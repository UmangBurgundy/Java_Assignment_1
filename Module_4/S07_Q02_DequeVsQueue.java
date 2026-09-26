import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class S07_Q02_DequeVsQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        System.out.println("Queue (Single-ended FIFO): " + queue.poll());

        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Front");
        deque.offerLast("Back");
        System.out.println("Deque (Double-ended Queue/Stack) First: " + deque.pollFirst());
        System.out.println("Deque Last: " + deque.pollLast());
    }
}
