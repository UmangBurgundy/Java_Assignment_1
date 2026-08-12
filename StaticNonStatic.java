public class StaticNonStatic {
    static int staticCount = 0;
    int instanceCount = 0;

    StaticNonStatic() {
        staticCount++;
        instanceCount++;
    }

    public static void main(String[] args) {
        StaticNonStatic obj1 = new StaticNonStatic();
        StaticNonStatic obj2 = new StaticNonStatic();
        System.out.println("Static Count: " + staticCount);
        System.out.println("Obj2 Instance Count: " + obj2.instanceCount);
    }
}
