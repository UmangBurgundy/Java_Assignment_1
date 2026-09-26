import java.util.HashMap;
import java.util.Map;

public class S11_Q03_CharFrequencyHashMap {
    public static void main(String[] args) {
        String input = "collections framework";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies for: \"" + input + "\"");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
