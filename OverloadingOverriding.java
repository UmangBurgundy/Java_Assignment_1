public class OverloadingOverriding {
    static class Calculator {
        int add(int a, int b) { return a + b; }
        double add(double a, double b) { return a + b; }
    }

    static class ScientificCalculator extends Calculator {
        @Override
        int add(int a, int b) {
            System.out.println("Scientific addition:");
            return super.add(a, b);
        }
    }

    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println("Sum int: " + calc.add(10, 20));
        System.out.println("Sum double: " + calc.add(5.5, 4.5));
    }
}
