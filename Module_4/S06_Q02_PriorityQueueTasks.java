import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class S06_Q02_PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.add(new Task("Write Report", 3));
        taskQueue.add(new Task("Fix Critical Bug", 1));
        taskQueue.add(new Task("Respond to Emails", 2));
        taskQueue.add(new Task("Clean Workspace", 4));

        System.out.println("All tasks added.");
        Task highest = taskQueue.poll();
        System.out.println("Removed highest-priority task: " + highest);

        System.out.println("Remaining tasks in queue:");
        for (Task t : taskQueue) {
            System.out.println(t);
        }
    }
}
