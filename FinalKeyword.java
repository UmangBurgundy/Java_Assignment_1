public class FinalKeyword {
    final int MAX_LIMIT = 100;

    final void display() {
        System.out.println("Max limit is fixed at: " + MAX_LIMIT);
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
    }
}
