import java.util.ArrayList;

public class S11_Q02_TodoListApp {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removed = tasks.remove(index);
            System.out.println("Task removed: " + removed);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void displayTasks() {
        System.out.println("To-Do List:");
        if (tasks.isEmpty()) {
            System.out.println("(No tasks)");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        S11_Q02_TodoListApp todo = new S11_Q02_TodoListApp();

        todo.addTask("Buy groceries");
        todo.addTask("Complete Java assignment");
        todo.addTask("Read a book");

        todo.displayTasks();

        todo.removeTask(1);

        todo.displayTasks();
    }
}
