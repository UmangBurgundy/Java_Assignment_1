public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        System.out.println("Modified: " + sb);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
