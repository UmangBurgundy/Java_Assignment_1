import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RuntimeAnnotation {
    String value() default "Available via reflection at runtime";
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface ClassAnnotation {
    String value() default "In bytecode but not available at runtime";
}

@RuntimeAnnotation
@ClassAnnotation
public class S01_Q11_RuntimeVsClassRetention {

    public static void main(String[] args) {
        boolean runtimePresent = S01_Q11_RuntimeVsClassRetention.class
                .isAnnotationPresent(RuntimeAnnotation.class);
        boolean classPresent = S01_Q11_RuntimeVsClassRetention.class
                .isAnnotationPresent(ClassAnnotation.class);

        System.out.println("RUNTIME retention accessible: " + runtimePresent);
        System.out.println("CLASS retention accessible: " + classPresent);
        System.out.println();
        System.out.println("RUNTIME - retained in .class file AND accessible via reflection");
        System.out.println("CLASS - retained in .class file but NOT accessible via reflection");
    }
}
