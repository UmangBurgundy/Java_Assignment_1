public class SplitStringWords {
    public static void main(String[] args) {
        String text = "Java is simple and powerful";
        String[] words = text.split("\\s+");
        System.out.println("Words in sentence:");
        for (String w : words) {
            System.out.println("- " + w);
        }
    }
}
