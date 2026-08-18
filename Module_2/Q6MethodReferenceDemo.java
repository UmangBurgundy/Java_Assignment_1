@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int number);
}

public class Q6MethodReferenceDemo {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // Using method reference to static method 'square'
        SquareCalculator calc = Q6MethodReferenceDemo::square;

        int number = 7;
        int result = calc.calculateSquare(number);

        System.out.println("The square of " + number + " is: " + result);
    }
}
