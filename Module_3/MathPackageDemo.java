// 23. Using java.lang Package
// Demonstrates Math.random(), Math.abs(), and Math.pow() from the java.lang package.

public class MathPackageDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating java.lang.Math Methods ===\n");

        // 1. Math.abs() - Absolute value
        int negativeInt = -42;
        double negativeDouble = -135.789;
        System.out.println("--- 1. Math.abs() ---");
        System.out.println("Math.abs(" + negativeInt + ") = " + Math.abs(negativeInt));
        System.out.println("Math.abs(" + negativeDouble + ") = " + Math.abs(negativeDouble));

        // 2. Math.pow() - Power calculation
        double base = 2.0;
        double exponent = 8.0;
        double powerResult = Math.pow(base, exponent);
        System.out.println("\n--- 2. Math.pow() ---");
        System.out.println(base + " raised to power " + exponent + " = " + powerResult);
        System.out.println("5.0 raised to power 3.0 = " + Math.pow(5.0, 3.0));

        // 3. Math.random() - Pseudo-random double in [0.0, 1.0)
        System.out.println("\n--- 3. Math.random() ---");
        System.out.println("Random decimal between 0.0 and 1.0: " + Math.random());
        
        // Generating random integers in range [1, 100]
        int min = 1;
        int max = 100;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);

        // Generating a random dice roll [1 to 6]
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("Simulated 6-sided dice roll: " + diceRoll);
    }
}
