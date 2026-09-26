import java.util.ArrayList;

public class S02_Q10_CollectionVsArraysBenefits {
    public static void main(String[] args) {
        int[] fixedArray = new int[2];
        fixedArray[0] = 10;
        fixedArray[1] = 20;

        ArrayList<Integer> dynamicList = new ArrayList<>();
        dynamicList.add(10);
        dynamicList.add(20);
        dynamicList.add(30);
        dynamicList.remove(Integer.valueOf(10));

        System.out.println("Array length is fixed: " + fixedArray.length);
        System.out.println("Dynamic list handles resizing and removal: " + dynamicList);
    }
}
