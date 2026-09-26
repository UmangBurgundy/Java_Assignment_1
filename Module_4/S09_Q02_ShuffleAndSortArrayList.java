import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class S09_Q02_ShuffleAndSortArrayList {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>(Arrays.asList("Ace", "King", "Queen", "Jack", "Ten"));
        System.out.println("Original: " + cards);

        Collections.shuffle(cards);
        System.out.println("Shuffled: " + cards);

        Collections.sort(cards);
        System.out.println("Sorted: " + cards);
    }
}
