import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S09_Q01_CollectionsUtilityMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(40, 10, 30, 20, 50));

        Collections.sort(list);
        System.out.println("sort: " + list);

        Collections.reverse(list);
        System.out.println("reverse: " + list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("max: " + max + ", min: " + min);

        int freq = Collections.frequency(list, 20);
        System.out.println("frequency of 20: " + freq);
    }
}
