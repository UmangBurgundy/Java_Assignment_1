public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("Reversed Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}
