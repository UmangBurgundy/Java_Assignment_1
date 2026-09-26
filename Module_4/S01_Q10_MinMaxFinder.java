import java.util.Arrays;
import java.util.List;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;

    public MinMaxFinder(List<T> list) {
        this.list = list;
    }

    public T findMin() {
        if (list == null || list.isEmpty()) return null;
        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T findMax() {
        if (list == null || list.isEmpty()) return null;
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

public class S01_Q10_MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 12, 89, 3, 67);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(numbers);
        System.out.println("Min: " + intFinder.findMin());
        System.out.println("Max: " + intFinder.findMax());

        List<String> words = Arrays.asList("orange", "apple", "mango", "banana");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(words);
        System.out.println("Min: " + strFinder.findMin());
        System.out.println("Max: " + strFinder.findMax());
    }
}
