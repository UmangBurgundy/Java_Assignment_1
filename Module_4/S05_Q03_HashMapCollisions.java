import java.util.HashMap;
import java.util.Objects;

class CollidingKey {
    String value;

    public CollidingKey(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CollidingKey other = (CollidingKey) obj;
        return Objects.equals(this.value, other.value);
    }

    @Override
    public String toString() {
        return value;
    }
}

public class S05_Q03_HashMapCollisions {
    public static void main(String[] args) {
        HashMap<CollidingKey, String> map = new HashMap<>();

        CollidingKey k1 = new CollidingKey("Key1");
        CollidingKey k2 = new CollidingKey("Key2");
        CollidingKey k3 = new CollidingKey("Key3");

        map.put(k1, "Data 1");
        map.put(k2, "Data 2");
        map.put(k3, "Data 3");

        System.out.println("All keys share hashCode: 42");
        System.out.println("Lookup k1: " + map.get(k1));
        System.out.println("Lookup k2: " + map.get(k2));
        System.out.println("Lookup k3: " + map.get(k3));
        System.out.println("Map size: " + map.size());
    }
}
