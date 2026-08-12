public class TernaryOperator {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("Score: " + score + " -> Grade: " + grade);
    }
}
