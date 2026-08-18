public class Q7TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Demonstrating try-catch block ===");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in try-catch: " + e.getMessage());
        }

        System.out.println("\n=== 2. Demonstrating try-catch-finally block ===");
        try {
            int a = 20;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed! This always runs regardless of exception occurrence.");
        }

        System.out.println("\n=== 3. Try-catch-finally with no exception ===");
        try {
            int a = 20;
            int b = 4;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed even when no exception occurs.");
        }
    }
}
