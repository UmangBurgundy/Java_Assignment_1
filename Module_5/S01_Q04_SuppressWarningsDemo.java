import java.util.ArrayList;
import java.util.List;

public class S01_Q04_SuppressWarningsDemo {

    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        Thread t = new Thread();
        t.stop();
    }

    @SuppressWarnings("unchecked")
    public void uncheckedDemo() {
        List list = new ArrayList();
        list.add("Hello");
        list.add(42);
        System.out.println("List: " + list);
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    public void multipleSuppressed() {
        List list = new ArrayList();
        list.add("Suppressing multiple warnings");
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        S01_Q04_SuppressWarningsDemo obj = new S01_Q04_SuppressWarningsDemo();
        obj.uncheckedDemo();
        obj.multipleSuppressed();
        System.out.println("@SuppressWarnings tells compiler to ignore specific warnings.");
    }
}
