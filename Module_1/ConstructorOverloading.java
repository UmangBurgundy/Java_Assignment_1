public class ConstructorOverloading {
    static class Rectangle {
        double length, width;
        Rectangle() { this(1.0, 1.0); }
        Rectangle(double side) { this(side, side); }
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        double area() { return length * width; }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println("Areas: " + r1.area() + ", " + r2.area() + ", " + r3.area());
    }
}
