import java.util.LinkedList;
import java.util.Queue;

public class S07_Q04_QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Customer 1");
        queue.offer("Customer 2");
        queue.offer("Customer 3");

        System.out.println("Head of queue (peek): " + queue.peek());

        System.out.println("Serving: " + queue.poll());
        System.out.println("Serving: " + queue.poll());

        System.out.println("Remaining queue: " + queue);
    }
}
