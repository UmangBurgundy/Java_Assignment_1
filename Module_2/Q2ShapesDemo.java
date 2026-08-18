import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Q2ShapesDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("--- Circle ---");
        System.out.printf("Area: %.2f%n", circle.area());
        System.out.printf("Perimeter: %.2f%n", circle.perimeter());

        System.out.println("\n--- Rectangle ---");
        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
    }
}
