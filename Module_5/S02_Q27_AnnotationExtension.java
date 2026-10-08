import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface BaseAnnotation {
    String value() default "base";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ExtendedAnnotation {
    String value() default "extended";
}

@BaseAnnotation("first")
@ExtendedAnnotation("second")
class AnnotatedClass {
}

public class S02_Q27_AnnotationExtension {

    public static void main(String[] args) {
        System.out.println("Can a custom annotation extend another annotation?");
        System.out.println("NO - annotations cannot extend other annotations.");
        System.out.println();
        System.out.println("Reasons:");
        System.out.println("1. All annotations implicitly extend java.lang.annotation.Annotation");
        System.out.println("2. Java does not support multiple inheritance for annotations");
        System.out.println("3. The 'extends' keyword is not allowed in annotation declarations");
        System.out.println();
        System.out.println("Workaround: Use multiple annotations on the same element");

        BaseAnnotation ba = AnnotatedClass.class.getAnnotation(BaseAnnotation.class);
        ExtendedAnnotation ea = AnnotatedClass.class.getAnnotation(ExtendedAnnotation.class);
        System.out.println("\nBaseAnnotation: " + ba.value());
        System.out.println("ExtendedAnnotation: " + ea.value());
    }
}
