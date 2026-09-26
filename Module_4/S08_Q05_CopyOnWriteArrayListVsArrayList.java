import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class S08_Q05_CopyOnWriteArrayListVsArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");

        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("A");
        cowList.add("B");

        System.out.println("ArrayList iterators fail-fast on modification during iteration.");
        System.out.println("CopyOnWriteArrayList creates a fresh copy on write, providing safe read-heavy iteration.");

        for (String item : cowList) {
            cowList.add("C");
        }
        System.out.println("CopyOnWriteArrayList successfully modified during iteration: " + cowList);
    }
}
