public class ControlStatements {
    public static void main(String[] args) {
        int num = 15;
        if (num % 2 == 0) System.out.println(num + " is Even");
        else System.out.println(num + " is Odd");

        switch (num) {
            case 15 -> System.out.println("Value is 15");
            default -> System.out.println("Other value");
        }
    }
}
