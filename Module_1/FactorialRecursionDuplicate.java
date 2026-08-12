public class FactorialRecursionDuplicate {
    static long fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 6 = " + fact(6));
    }
}
