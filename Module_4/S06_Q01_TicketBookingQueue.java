import java.util.LinkedList;
import java.util.Queue;

public class S06_Q01_TicketBookingQueue {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();

        ticketQueue.offer("Passenger Alice");
        ticketQueue.offer("Passenger Bob");
        ticketQueue.offer("Passenger Charlie");

        System.out.println("Initial Queue: " + ticketQueue);

        while (!ticketQueue.isEmpty()) {
            String served = ticketQueue.poll();
            System.out.println("Processing ticket for: " + served);
        }

        System.out.println("All passengers served. Queue empty? " + ticketQueue.isEmpty());
    }
}
