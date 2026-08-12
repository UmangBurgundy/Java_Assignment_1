public class StringPalindrome {
    static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "Was it a car or a cat I saw?";
        System.out.println("\"" + test + "\" is Palindrome? " + isPalindrome(test));
    }
}
