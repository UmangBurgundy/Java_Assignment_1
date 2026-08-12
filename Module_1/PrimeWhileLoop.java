public class PrimeWhileLoop {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = n > 1;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) { isPrime = false; break; }
            i++;
        }
        System.out.println(n + " is prime? " + isPrime);
    }
}
