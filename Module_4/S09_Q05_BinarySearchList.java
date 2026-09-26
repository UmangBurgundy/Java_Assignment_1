import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S09_Q05_BinarySearchList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 50, 30, 20, 40));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        int key = 30;
        int index = Collections.binarySearch(list, key);
        System.out.println("Element " + key + " found at index: " + index);

        int missingKey = 25;
        int missingIndex = Collections.binarySearch(list, missingKey);
        System.out.println("Missing element " + missingKey + " search result: " + missingIndex);
    }
}
