import java.util.ArrayList;
import java.util.List;

public class S01_Q02_BuiltInAnnotations {

    @Override
    public String toString() {
        return "S01_Q02_BuiltInAnnotations instance";
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @SuppressWarnings("unchecked")
    public void suppressedMethod() {
        List list = new ArrayList();
        list.add("Unchecked warning suppressed");
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        S01_Q02_BuiltInAnnotations obj = new S01_Q02_BuiltInAnnotations();
        System.out.println(obj.toString());
        obj.oldMethod();
        obj.suppressedMethod();
    }
}
