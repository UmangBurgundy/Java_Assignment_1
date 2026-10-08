import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface SourceOnly {
    String value() default "Discarded after compilation";
}

@Retention(RetentionPolicy.CLASS)
@interface ClassOnly {
    String value() default "Stored in class file but not available at runtime";
}

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAvailable {
    String value() default "Available at runtime via reflection";
}

@SourceOnly
@ClassOnly
@RuntimeAvailable
public class S01_Q08_RetentionPolicy {

    public static void main(String[] args) {
        System.out.println("SOURCE - discarded by compiler, not in .class file");
        System.out.println("CLASS - stored in .class file, not available at runtime");
        System.out.println("RUNTIME - available at runtime through reflection");

        Annotation[] annotations = S01_Q08_RetentionPolicy.class.getAnnotations();
        System.out.println("\nAnnotations available at runtime: " + annotations.length);
        for (Annotation a : annotations) {
            System.out.println("  " + a);
        }
    }
}
