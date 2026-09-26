import java.util.HashSet;

public class S04_Q04_HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        boolean addedFirst = set.add("DuplicateItem");
        boolean addedSecond = set.add("DuplicateItem");

        System.out.println("First add returned: " + addedFirst);
        System.out.println("Second add returned: " + addedSecond);
        System.out.println("HashSet size: " + set.size());
        System.out.println("HashSet content: " + set);
    }
}
