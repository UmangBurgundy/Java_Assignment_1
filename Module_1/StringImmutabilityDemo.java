public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String original = "Java";
        String modified = original.concat(" Code");
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
        System.out.println("Are references equal? " + (original == modified));
    }
}
