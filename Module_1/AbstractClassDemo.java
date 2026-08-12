public class AbstractClassDemo {
    abstract static class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double radius;
        Circle(double r) { radius = r; }
        double area() { return Math.PI * radius * radius; }
    }

    static class Square extends Shape {
        double side;
        Square(double s) { side = s; }
        double area() { return side * side; }
    }

    public static void main(String[] args) {
        Shape c = new Circle(5.0);
        Shape s = new Square(4.0);
        System.out.println("Circle area: " + c.area());
        System.out.println("Square area: " + s.area());
    }
}
