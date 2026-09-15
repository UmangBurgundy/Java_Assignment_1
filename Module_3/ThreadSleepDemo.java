// 3. Thread Sleep Method
// Two threads: First thread prints "Thread 1" every 1 second, second thread prints "Thread 2" every 2 seconds.

public class ThreadSleepDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Thread 1 - iteration " + i);
                try {
                    Thread.sleep(1000); // 1-second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted");
                    return;
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 2 - iteration " + i);
                try {
                    Thread.sleep(2000); // 2-second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted");
                    return;
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads completed execution.");
    }
}
