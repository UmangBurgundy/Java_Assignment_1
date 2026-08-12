public class MultilevelInheritance {
    static class Grandparent {
        void grand() { System.out.println("Grandparent wisdom"); }
    }
    static class Parent extends Grandparent {
        void parent() { System.out.println("Parent guidance"); }
    }
    static class Child extends Parent {
        void child() { System.out.println("Child innovation"); }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.grand();
        c.parent();
        c.child();
    }
}
