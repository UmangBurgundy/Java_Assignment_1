import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "hello java";
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : text.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequencies: " + counts);
    }
}
