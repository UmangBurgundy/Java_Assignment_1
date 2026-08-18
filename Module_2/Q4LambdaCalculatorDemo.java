@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Q4LambdaCalculatorDemo {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        int num1 = 12;
        int num2 = 4;

        System.out.println("Addition (" + num1 + " + " + num2 + "): " + addition.compute(num1, num2));
        System.out.println("Subtraction (" + num1 + " - " + num2 + "): " + subtraction.compute(num1, num2));
        System.out.println("Multiplication (" + num1 + " * " + num2 + "): " + multiplication.compute(num1, num2));
    }
}
