public class FinalClassMethod {
    static class MathUtil {
        final double square(double x) { return x * x; }
    }

    final static class ImmutableConfig {
        void show() { System.out.println("Config loaded."); }
    }

    public static void main(String[] args) {
        MathUtil u = new MathUtil();
        System.out.println("Square of 9: " + u.square(9));
        ImmutableConfig cfg = new ImmutableConfig();
        cfg.show();
    }
}
