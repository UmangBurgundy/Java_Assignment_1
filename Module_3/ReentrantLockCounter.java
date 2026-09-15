import java.util.concurrent.locks.ReentrantLock;

class UnsafeCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SafeCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

public class ReentrantLockCounter {
    private static final int NUM_THREADS = 5;
    private static final int INCREMENTS_PER_THREAD = 10000;
    private static final int EXPECTED_TOTAL = NUM_THREADS * INCREMENTS_PER_THREAD;

    public static void main(String[] args) {

        UnsafeCounter unsafeCounter = new UnsafeCounter();
        Thread[] unsafeThreads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            unsafeThreads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    unsafeCounter.increment();
                }
            });
            unsafeThreads[i].start();
        }

        for (Thread t : unsafeThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        SafeCounter safeCounter = new SafeCounter();
        Thread[] safeThreads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            safeThreads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    safeCounter.increment();
                }
            });
            safeThreads[i].start();
        }

        for (Thread t : safeThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Expected Count: " + EXPECTED_TOTAL);
        System.out.println("Unsafe Counter Result (without lock) : " + unsafeCounter.getCount() +
                           (unsafeCounter.getCount() != EXPECTED_TOTAL ? " (Race condition occurred!)" : ""));
        System.out.println("Safe Counter Result (with ReentrantLock): " + safeCounter.getCount() + " (Always correct!)");
    }
}
