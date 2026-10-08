import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Role("ADMIN")
@Role("USER")
@Role("MANAGER")
class AdminUser {
}

@Role("USER")
class RegularUser {
}

public class S01_Q18_RepeatableAnnotations {

    public static void main(String[] args) {
        System.out.println("AdminUser roles:");
        Role[] roles = AdminUser.class.getAnnotationsByType(Role.class);
        for (Role role : roles) {
            System.out.println("  " + role.value());
        }

        System.out.println("\nRegularUser roles:");
        Role[] regularRoles = RegularUser.class.getAnnotationsByType(Role.class);
        for (Role role : regularRoles) {
            System.out.println("  " + role.value());
        }
    }
}
