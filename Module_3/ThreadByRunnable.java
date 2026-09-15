// 2. Create a thread by implementing the Runnable interface
// Takes a string "MULTITHREADING" and prints its characters in reverse order one by one.

class ReverseStringRunnable implements Runnable {
    private final String text;

    public ReverseStringRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        System.out.println("Original String: " + text);
        System.out.print("Reversed Characters: ");
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
            try {
                Thread.sleep(300); // Small delay to show character-by-character printing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nThread interrupted.");
                return;
            }
        }
        System.out.println("\nCompleted reversing string.");
    }
}

public class ThreadByRunnable {
    public static void main(String[] args) {
        ReverseStringRunnable task = new ReverseStringRunnable("MULTITHREADING");
        Thread workerThread = new Thread(task);
        workerThread.start();

        try {
            workerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
