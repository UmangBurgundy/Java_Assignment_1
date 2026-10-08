import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldAnnotation {
    String value() default "field level only";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodAnnotation {
    String value() default "method level only";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface MultiTarget {
    String value() default "multiple targets";
}

@MultiTarget("class level")
public class S01_Q10_TargetMetaAnnotation {

    @FieldAnnotation("name field")
    @MultiTarget("field level")
    private String name;

    @MethodAnnotation("display method")
    @MultiTarget("method level")
    public void display() {
        System.out.println("@Target restricts where an annotation can be applied");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("ElementType.TYPE - classes, interfaces, enums");
        System.out.println("ElementType.FIELD - fields");
        System.out.println("ElementType.METHOD - methods");
        System.out.println("ElementType.PARAMETER - method parameters");
        System.out.println("ElementType.CONSTRUCTOR - constructors");
        System.out.println("ElementType.LOCAL_VARIABLE - local variables");
        System.out.println("ElementType.ANNOTATION_TYPE - other annotations");
        System.out.println("ElementType.PACKAGE - packages");

        MultiTarget classAnnotation = S01_Q10_TargetMetaAnnotation.class.getAnnotation(MultiTarget.class);
        System.out.println("\nClass annotation: " + classAnnotation.value());
    }
}
