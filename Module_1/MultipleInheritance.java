public class MultipleInheritance {
    interface Printable { void print(); }
    interface Printable3D { void print3D(); }

    static class AdvancedPrinter implements Printable, Printable3D {
        public void print() { System.out.println("2D Printing..."); }
        public void print3D() { System.out.println("3D Printing..."); }
    }

    public static void main(String[] args) {
        AdvancedPrinter p = new AdvancedPrinter();
        p.print();
        p.print3D();
    }
}
