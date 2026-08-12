public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) instance = new SingletonClass();
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println("Same instance? " + (s1 == s2));
        s1.showMessage();
    }
}
