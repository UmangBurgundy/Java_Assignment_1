import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S01_Q04_WildcardsExtendsSuper {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        printNumbers(intList);

        List<Number> numList = new ArrayList<>();
        addIntegers(numList);
        printNumbers(numList);
    }
}
