import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S09_Q06_FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "apple", "banana");

        int appleFreq = Collections.frequency(list, "apple");
        int bananaFreq = Collections.frequency(list, "banana");
        int cherryFreq = Collections.frequency(list, "cherry");

        System.out.println("Frequency of 'apple': " + appleFreq);
        System.out.println("Frequency of 'banana': " + bananaFreq);
        System.out.println("Frequency of 'cherry': " + cherryFreq);
    }
}
