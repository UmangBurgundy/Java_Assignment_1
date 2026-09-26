import java.util.ArrayList;
import java.util.Vector;

public class S03_Q04_VectorVsArrayList {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Thread-safe Vector element");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Non-synchronized ArrayList element");

        System.out.println("Vector capacity default increment is 100%: " + vector.capacity());
        System.out.println("Vector content: " + vector);
        System.out.println("ArrayList content: " + arrayList);
    }
}
