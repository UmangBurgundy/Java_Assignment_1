import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface StringLength {
    int min() default 0;
    int max() default 255;
}

class UserForm {
    @StringLength(min = 3, max = 20)
    String username;

    @StringLength(min = 8, max = 50)
    String password;

    @StringLength(max = 100)
    String email;

    public UserForm(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

public class S01_Q17_StringLengthValidator {

    public static boolean validate(Object obj) throws IllegalAccessException {
        boolean valid = true;
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(StringLength.class)) {
                field.setAccessible(true);
                StringLength sl = field.getAnnotation(StringLength.class);
                String value = (String) field.get(obj);
                int len = (value == null) ? 0 : value.length();
                if (len < sl.min() || len > sl.max()) {
                    System.out.println("INVALID: " + field.getName() + " (length " + len +
                            ") must be between " + sl.min() + " and " + sl.max());
                    valid = false;
                } else {
                    System.out.println("VALID: " + field.getName() + " (length " + len + ")");
                }
            }
        }
        return valid;
    }

    public static void main(String[] args) throws IllegalAccessException {
        UserForm validForm = new UserForm("Umang", "password123", "umang@test.com");
        System.out.println("Validating valid form:");
        validate(validForm);

        System.out.println();

        UserForm invalidForm = new UserForm("Um", "short", "test@example.com");
        System.out.println("Validating invalid form:");
        validate(invalidForm);
    }
}
