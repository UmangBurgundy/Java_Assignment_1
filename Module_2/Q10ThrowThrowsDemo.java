public class Q10ThrowThrowsDemo {

    // Method using 'throws' keyword to declare IllegalArgumentException
    public static long calculateFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            // Using 'throw' keyword to throw exception for negative input
            throw new IllegalArgumentException("Factorial cannot be calculated for negative number: " + number);
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int[] testInputs = {5, -4, 0};

        for (int input : testInputs) {
            try {
                System.out.println("Calculating factorial of: " + input);
                long result = calculateFactorial(input);
                System.out.println("Result: " + input + "! = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
            System.out.println("----------------------------------");
        }
    }
}
