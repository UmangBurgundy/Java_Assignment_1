public class S01_Q03_OverrideVsDeprecated {

    @Deprecated
    public void legacyMethod() {
        System.out.println("Legacy method - marked deprecated, should not be used.");
    }

    @Override
    public String toString() {
        return "Override ensures this method correctly overrides parent method.";
    }

    public static void main(String[] args) {
        S01_Q03_OverrideVsDeprecated obj = new S01_Q03_OverrideVsDeprecated();
        System.out.println(obj.toString());
        obj.legacyMethod();
        System.out.println("@Override - compile-time check for correct method overriding");
        System.out.println("@Deprecated - indicates a method should no longer be used");
    }
}
