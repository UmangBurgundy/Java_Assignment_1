import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Permission {
    String[] roles();
    String[] actions() default {"READ"};
}

public class S02_Q25_ArrayParameterAnnotation {

    @Permission(roles = {"ADMIN", "MANAGER"}, actions = {"READ", "WRITE", "DELETE"})
    public void adminAction() {
        System.out.println("Admin action executed");
    }

    @Permission(roles = {"USER"})
    public void userAction() {
        System.out.println("User action executed");
    }

    public static void main(String[] args) throws Exception {
        for (Method method : S02_Q25_ArrayParameterAnnotation.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Permission.class)) {
                Permission p = method.getAnnotation(Permission.class);
                System.out.println("Method: " + method.getName());
                System.out.print("  Roles: ");
                for (String role : p.roles()) {
                    System.out.print(role + " ");
                }
                System.out.print("\n  Actions: ");
                for (String action : p.actions()) {
                    System.out.print(action + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
