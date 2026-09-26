import java.util.ArrayList;
import java.util.List;

public class S01_Q01_GenericsPurpose {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Generics");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
