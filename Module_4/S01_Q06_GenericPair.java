class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class S01_Q06_GenericPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 21);
        System.out.println(pair.getKey() + ": " + pair.getValue());
        pair.setKey("Score");
        pair.setValue(95);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}
