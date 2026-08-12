public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 89, 5, 67 };
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
