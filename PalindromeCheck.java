public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 12321, original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original + " is Palindrome? " + (original == rev));
    }
}
