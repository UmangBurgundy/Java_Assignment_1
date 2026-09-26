import java.util.ArrayList;

public class S03_Q03_ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
