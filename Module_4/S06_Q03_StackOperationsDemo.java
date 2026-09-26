import java.util.Stack;

public class S06_Q03_StackOperationsDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack after pushes: " + stack);

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty after removing all? " + stack.isEmpty());
    }
}
