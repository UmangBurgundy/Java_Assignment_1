public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10, a = 0, b = 1;
        System.out.print("Fibonacci (" + count + " terms): ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}
