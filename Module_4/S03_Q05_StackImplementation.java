import java.util.List;
import java.util.Stack;

public class S03_Q05_StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        List<Integer> listRef = stack;
        System.out.println("Stack viewed as List: " + listRef);
        System.out.println("Element at index 1 via List method: " + listRef.get(1));
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Peek top of stack: " + stack.peek());
    }
}
