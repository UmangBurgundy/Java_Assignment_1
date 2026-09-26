import java.util.ArrayList;
import java.util.Vector;

public class S08_Q01_VectorVsArrayListThreadSafety {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Vector methods are synchronized, providing thread-safety with performance overhead.");
        System.out.println("ArrayList methods are unsynchronized, faster for single-threaded usage.");

        vector.add(10);
        arrayList.add(10);

        System.out.println("Vector size: " + vector.size() + ", ArrayList size: " + arrayList.size());
    }
}
