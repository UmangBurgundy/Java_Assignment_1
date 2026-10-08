import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@interface Validate {
    String value();
}

public class S01_Q12_ReflectionProcessing {

    @Validate("username")
    private String username = "admin";

    @Validate("login")
    public void login() {
        System.out.println("Logging in...");
    }

    @Validate("logout")
    public void logout() {
        System.out.println("Logging out...");
    }

    public static void main(String[] args) throws Exception {
        S01_Q12_ReflectionProcessing obj = new S01_Q12_ReflectionProcessing();

        System.out.println("Processing field annotations:");
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Validate.class)) {
                Validate v = field.getAnnotation(Validate.class);
                field.setAccessible(true);
                System.out.println("  Field: " + v.value() + " = " + field.get(obj));
            }
        }

        System.out.println("\nProcessing method annotations:");
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Validate.class)) {
                Validate v = method.getAnnotation(Validate.class);
                System.out.println("  Method: " + v.value());
                method.invoke(obj);
            }
        }
    }
}
