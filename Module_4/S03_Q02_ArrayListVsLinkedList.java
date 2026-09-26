import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S03_Q02_ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        System.out.println("ArrayList (array-backed, fast O(1) random access): " + arrayList.get(0));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.addFirst("Head Element");
        System.out.println("LinkedList (doubly-linked, fast O(1) head/tail insertions): " + linkedList);
    }
}
