import java.util.ArrayDeque;
import java.util.Deque;

public class S06_Q04_ArrayDequeOperations {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Front-1");
        deque.addLast("Back-1");
        deque.addFirst("Front-2");
        deque.addLast("Back-2");
        System.out.println("After adding elements at both ends: " + deque);

        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
    }
}
