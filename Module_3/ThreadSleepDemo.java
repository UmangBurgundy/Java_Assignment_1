public class ThreadSleepDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Thread 1 - iteration " + i);
                try {
                    Thread.sleep(1000);
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
                    Thread.sleep(2000);
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
