// 6. Synchronized Method
// Ticket booking system where multiple users (threads) attempt to book tickets simultaneously.
// Uses synchronization to prevent overselling of tickets.

class TicketCounter {
    private int availableSeats;

    public TicketCounter(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Synchronized method prevents overselling by locking the instance
    public synchronized boolean bookTicket(String customerName, int seatsRequested) {
        System.out.println(customerName + " is attempting to book " + seatsRequested + " ticket(s)... Available: " + availableSeats);
        
        if (seatsRequested <= availableSeats) {
            try {
                // Simulate processing time
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            availableSeats -= seatsRequested;
            System.out.println("SUCCESS: " + customerName + " successfully booked " + seatsRequested + " ticket(s). Remaining: " + availableSeats);
            return true;
        } else {
            System.out.println("FAILED: " + customerName + " could not book " + seatsRequested + " ticket(s). Only " + availableSeats + " seat(s) left!");
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(5);

        Thread user1 = new Thread(() -> counter.bookTicket("Alice", 2), "User-Alice");
        Thread user2 = new Thread(() -> counter.bookTicket("Bob", 2), "User-Bob");
        Thread user3 = new Thread(() -> counter.bookTicket("Charlie", 2), "User-Charlie");
        Thread user4 = new Thread(() -> counter.bookTicket("Diana", 1), "User-Diana");

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final seats remaining: " + counter.getAvailableSeats());
    }
}
