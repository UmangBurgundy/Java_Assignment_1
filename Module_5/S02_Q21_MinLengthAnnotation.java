import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class Registration {
    @MinLength(5)
    String username;

    @MinLength(8)
    String password;

    @MinLength(3)
    String city;

    public Registration(String username, String password, String city) {
        this.username = username;
        this.password = password;
        this.city = city;
    }
}

public class S02_Q21_MinLengthAnnotation {

    public static void validate(Object obj) throws IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MinLength.class)) {
                field.setAccessible(true);
                MinLength ml = field.getAnnotation(MinLength.class);
                String value = (String) field.get(obj);
                int len = (value == null) ? 0 : value.length();
                if (len < ml.value()) {
                    System.out.println("FAIL: " + field.getName() + " length " + len +
                            " is less than minimum " + ml.value());
                } else {
                    System.out.println("PASS: " + field.getName() + " length " + len);
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Registration valid = new Registration("UmangJain", "password123", "Delhi");
        System.out.println("Valid registration:");
        validate(valid);

        System.out.println();

        Registration invalid = new Registration("UJ", "pass", "NY");
        System.out.println("Invalid registration:");
        validate(invalid);
    }
}
