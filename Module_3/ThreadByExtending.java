// 1. Create a thread by extending the Thread class
// Prints even numbers from 2 to 20 with a 500ms delay between each number.

class EvenNumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("EvenNumberThread started.");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("EvenNumberThread finished.");
    }
}

public class ThreadByExtending {
    public static void main(String[] args) {
        EvenNumberThread thread = new EvenNumberThread();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
