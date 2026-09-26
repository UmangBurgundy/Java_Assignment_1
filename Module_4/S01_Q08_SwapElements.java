import java.util.Arrays;

public class S01_Q08_SwapElements {
    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        swapElements(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Apple", "Banana", "Cherry"};
        swapElements(words, 1, 2);
        System.out.println(Arrays.toString(words));
    }
}
