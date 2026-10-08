import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name() default "";
}

class Product {
    @JsonField(name = "product_id")
    private int id;

    @JsonField(name = "product_name")
    private String name;

    @JsonField(name = "product_price")
    private double price;

    private String internalCode;

    public Product(int id, String name, double price, String internalCode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.internalCode = internalCode;
    }
}

public class S02_Q26_JsonFieldAnnotation {

    public static String toJson(Object obj) throws IllegalAccessException {
        Map<String, String> jsonMap = new LinkedHashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);
                String key = jf.name().isEmpty() ? field.getName() : jf.name();
                Object value = field.get(obj);
                if (value instanceof String) {
                    jsonMap.put(key, "\"" + value + "\"");
                } else {
                    jsonMap.put(key, String.valueOf(value));
                }
            }
        }
        StringBuilder sb = new StringBuilder("{\n");
        int i = 0;
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            sb.append("  \"").append(entry.getKey()).append("\": ").append(entry.getValue());
            if (i < jsonMap.size() - 1) sb.append(",");
            sb.append("\n");
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Product product = new Product(101, "Laptop", 999.99, "INTERNAL-001");
        System.out.println(toJson(product));
    }
}
