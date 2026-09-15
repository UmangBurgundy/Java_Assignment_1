// 8. Deadlock Example with Dining Philosophers
// Simulates a simple Dining Philosophers problem where two philosophers try to pick up
// chopsticks (resources) in opposite orders and create a deadlock situation.

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class DiningPhilosophersDeadlock {
    // Shared chopsticks (resources)
    private static final Object chopstick1 = new Object();
    private static final Object chopstick2 = new Object();

    public static void main(String[] args) {
        // Philosopher 1 tries to pick up chopstick 1 first, then chopstick 2
        Thread philosopher1 = new Thread(() -> {
            synchronized (chopstick1) {
                System.out.println("Philosopher 1: Picked up Chopstick 1 (left).");
                try {
                    // Small delay to ensure Philosopher 2 picks up Chopstick 2
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Philosopher 1: Waiting to pick up Chopstick 2 (right)...");
                synchronized (chopstick2) {
                    System.out.println("Philosopher 1: Picked up Chopstick 2. Eating...");
                }
            }
        }, "Philosopher-1");

        // Philosopher 2 tries to pick up chopstick 2 first, then chopstick 1 (Opposite order)
        Thread philosopher2 = new Thread(() -> {
            synchronized (chopstick2) {
                System.out.println("Philosopher 2: Picked up Chopstick 2 (right).");
                try {
                    // Small delay to ensure Philosopher 1 has acquired Chopstick 1
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Philosopher 2: Waiting to pick up Chopstick 1 (left)...");
                synchronized (chopstick1) {
                    System.out.println("Philosopher 2: Picked up Chopstick 1. Eating...");
                }
            }
        }, "Philosopher-2");

        philosopher1.start();
        philosopher2.start();

        // Monitor thread using ThreadMXBean to detect and report the deadlock
        Thread deadlockDetector = new Thread(() -> {
            try {
                Thread.sleep(1000);
                ThreadMXBean bean = ManagementFactory.getThreadMXBean();
                long[] deadlockedThreadIds = bean.findDeadlockedThreads();
                if (deadlockedThreadIds != null && deadlockedThreadIds.length > 0) {
                    System.out.println("\n*** DEADLOCK DETECTED! ***");
                    System.out.println("Philosophers are in circular wait deadlock:");
                    System.out.println("- Philosopher 1 holds Chopstick 1 and is blocked waiting for Chopstick 2.");
                    System.out.println("- Philosopher 2 holds Chopstick 2 and is blocked waiting for Chopstick 1.");
                    System.out.println("Deadlocked thread IDs count: " + deadlockedThreadIds.length);
                    System.out.println("Exiting simulation successfully after demonstrating deadlock.");
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        deadlockDetector.setDaemon(true);
        deadlockDetector.start();

        try {
            philosopher1.join();
            philosopher2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
