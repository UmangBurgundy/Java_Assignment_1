public class ReverseStringCustom {
    static String reverse(String input) {
        if (input == null) return null;
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String original = "Java Programming";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverse(original));
    }
}
