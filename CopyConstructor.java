public class CopyConstructor {
    static class ComplexNumber {
        double real, imaginary;
        ComplexNumber(double r, double i) { real = r; imaginary = i; }
        ComplexNumber(ComplexNumber other) { real = other.real; imaginary = other.imaginary; }
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber c2 = new ComplexNumber(c1);
        System.out.println("c2: " + c2.real + " + " + c2.imaginary + "i");
    }
}
