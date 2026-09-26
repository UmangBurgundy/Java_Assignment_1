class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class S01_Q07_GenericBox {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.addItem("Hello World");
        System.out.println(strBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(42);
        System.out.println(intBox.getItem());
    }
}
