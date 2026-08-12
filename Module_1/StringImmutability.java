public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat(" World");
        System.out.println("After concat without reassigning: " + s1);
        String s2 = s1.concat(" World");
        System.out.println("With reassigning: " + s2);
    }
}
