public class AbstractionInterfaces {
    interface Printable { void print(); }
    interface Scannable { void scan(); }

    static class MultiFunctionPrinter implements Printable, Scannable {
        public void print() { System.out.println("Printing document..."); }
        public void scan() { System.out.println("Scanning document..."); }
    }

    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}
