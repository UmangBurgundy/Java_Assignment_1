import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockFixTryLock {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    private static void safeLockExecution(String threadName, ReentrantLock firstLock, ReentrantLock secondLock) {
        boolean acquired = false;
        while (!acquired) {
            boolean gotFirst = false;
            boolean gotSecond = false;
            try {

                gotFirst = firstLock.tryLock(300, TimeUnit.MILLISECONDS);
                if (gotFirst) {
                    System.out.println(threadName + ": Acquired first lock. Attempting second lock...");

                    Thread.sleep(100);

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

        Thread thread1 = new Thread(() -> safeLockExecution("Thread-1 (lock1 -> lock2)", lock1, lock2));

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
