public class AccessModifiers {
    public int pub = 1;
    protected int prot = 2;
    int def = 3;
    private int priv = 4;

    public void show() {
        System.out.println("Public: " + pub + ", Protected: " + prot + ", Default: " + def + ", Private: " + priv);
    }

    public static void main(String[] args) {
        AccessModifiers demo = new AccessModifiers();
        demo.show();
    }
}
