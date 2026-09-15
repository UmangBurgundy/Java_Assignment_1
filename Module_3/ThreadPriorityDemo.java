// 5. Thread Naming and Priority
// Creates three threads: "Worker-1", "Worker-2", and "Worker-3".
// Assigns different priorities and prints messages showing their execution order.

class WorkerThread extends Thread {
    public WorkerThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + getName() + " [Priority: " + getPriority() + "]");
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " executing step " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread finished: " + getName());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        WorkerThread worker1 = new WorkerThread("Worker-1", Thread.MIN_PRIORITY);  // Priority 1
        WorkerThread worker2 = new WorkerThread("Worker-2", Thread.NORM_PRIORITY); // Priority 5
        WorkerThread worker3 = new WorkerThread("Worker-3", Thread.MAX_PRIORITY);  // Priority 10

        System.out.println("Starting threads with different priorities...");
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All worker threads completed.");
    }
}
