import java.util.ArrayList;
import java.util.List;

public class S01_Q05_RawVsParameterizedTypes {
    public static void main(String[] args) {
        List<String> parameterizedList = new ArrayList<>();
        parameterizedList.add("Valid");
        String item = parameterizedList.get(0);
        System.out.println(item);

        List rawList = new ArrayList();
        rawList.add("Raw Type");
        rawList.add(123);
        for (Object obj : rawList) {
            System.out.println(obj);
        }
    }
}
