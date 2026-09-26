class MyGeneric<T> {
    private T value;

    public MyGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class S01_Q02_GenericClassSyntax {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("Hello");
        MyGeneric<Integer> intObj = new MyGeneric<>(100);
        System.out.println(strObj.getValue());
        System.out.println(intObj.getValue());
    }
}
