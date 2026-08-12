public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] grid = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        System.out.println("2D Grid:");
        for (int[] row : grid) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
