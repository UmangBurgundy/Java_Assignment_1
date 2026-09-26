import java.util.HashSet;

public class S04_Q06_HashSetUniquenessDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        set.add("Python");

        System.out.println("Elements in HashSet:");
        for (String lang : set) {
            System.out.println(lang);
        }
        System.out.println("Total count: " + set.size());
    }
}
