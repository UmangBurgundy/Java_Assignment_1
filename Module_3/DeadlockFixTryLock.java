// 12. Deadlock Resolution Using tryLock() with Timeout
// Shows how two threads acquiring locks in opposite order can cause deadlock,
// and solves it using tryLock() with a timeout to avoid indefinite blocking.

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockFixTryLock {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    // Worker method that attempts to acquire both locks safely
    private static void safeLockExecution(String threadName, ReentrantLock firstLock, ReentrantLock secondLock) {
        boolean acquired = false;
        while (!acquired) {
            boolean gotFirst = false;
            boolean gotSecond = false;
            try {
                // Try to acquire first lock with a 300ms timeout
                gotFirst = firstLock.tryLock(300, TimeUnit.MILLISECONDS);
                if (gotFirst) {
                    System.out.println(threadName + ": Acquired first lock. Attempting second lock...");
                    // Small delay to simulate work and increase contention
                    Thread.sleep(100);

                    // Try to acquire second lock with a 300ms timeout
                    gotSecond = secondLock.tryLock(300, TimeUnit.MILLISECONDS);
                    if (gotSecond) {
                        System.out.println(threadName + ": Successfully acquired BOTH locks! Executing critical section...");
                        Thread.sleep(200);
                        acquired = true;
                    } else {
                        System.out.println(threadName + ": Timed out waiting for second lock. Releasing first lock to prevent deadlock.");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } finally {
                if (gotSecond) {
                    secondLock.unlock();
                    System.out.println(threadName + ": Released second lock.");
                }
                if (gotFirst) {
                    firstLock.unlock();
                    System.out.println(threadName + ": Released first lock.");
                }
            }

            if (!acquired) {
                // Back off randomly before retrying
                try {
                    Thread.sleep((long) (Math.random() * 200 + 50));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Deadlock Prevention using ReentrantLock tryLock() with timeout:\n");

        // Thread 1 acquires lock1 first, then lock2
        Thread thread1 = new Thread(() -> safeLockExecution("Thread-1 (lock1 -> lock2)", lock1, lock2));

        // Thread 2 acquires lock2 first, then lock1 (Opposite order)
        Thread thread2 = new Thread(() -> safeLockExecution("Thread-2 (lock2 -> lock1)", lock2, lock1));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nBoth threads completed without deadlock using tryLock(timeout)!");
    }
}
