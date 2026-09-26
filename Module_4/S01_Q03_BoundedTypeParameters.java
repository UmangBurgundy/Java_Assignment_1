class NumberContainer<T extends Number> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}

public class S01_Q03_BoundedTypeParameters {
    public static void main(String[] args) {
        NumberContainer<Integer> intBox = new NumberContainer<>(5);
        NumberContainer<Double> doubleBox = new NumberContainer<>(2.5);
        System.out.println(intBox.square());
        System.out.println(doubleBox.square());
    }
}
