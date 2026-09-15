public class MathPackageDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating java.lang.Math Methods ===\n");

        int negativeInt = -42;
        double negativeDouble = -135.789;
        System.out.println("--- 1. Math.abs() ---");
        System.out.println("Math.abs(" + negativeInt + ") = " + Math.abs(negativeInt));
        System.out.println("Math.abs(" + negativeDouble + ") = " + Math.abs(negativeDouble));

        double base = 2.0;
        double exponent = 8.0;
        double powerResult = Math.pow(base, exponent);
        System.out.println("\n--- 2. Math.pow() ---");
        System.out.println(base + " raised to power " + exponent + " = " + powerResult);
        System.out.println("5.0 raised to power 3.0 = " + Math.pow(5.0, 3.0));

        System.out.println("\n--- 3. Math.random() ---");
        System.out.println("Random decimal between 0.0 and 1.0: " + Math.random());

        int min = 1;
        int max = 100;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);

        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("Simulated 6-sided dice roll: " + diceRoll);
    }
}
