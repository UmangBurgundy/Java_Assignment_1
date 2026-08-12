public class LargestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 18;
        int max = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Largest of " + a + ", " + b + ", " + c + " is: " + max);
    }
}
