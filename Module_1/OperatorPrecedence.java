public class OperatorPrecedence {
    public static void main(String[] args) {
        int res1 = 10 + 2 * 5;
        int res2 = (10 + 2) * 5;
        System.out.println("10 + 2 * 5 = " + res1);
        System.out.println("(10 + 2) * 5 = " + res2);
    }
}
