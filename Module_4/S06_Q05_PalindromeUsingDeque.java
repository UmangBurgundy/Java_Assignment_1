import java.util.ArrayDeque;
import java.util.Deque;

public class S06_Q05_PalindromeUsingDeque {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(ch);
            }
        }

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "radar";
        String test2 = "level";
        String test3 = "hello";

        System.out.println(test1 + " is palindrome? " + isPalindrome(test1));
        System.out.println(test2 + " is palindrome? " + isPalindrome(test2));
        System.out.println(test3 + " is palindrome? " + isPalindrome(test3));
    }
}
