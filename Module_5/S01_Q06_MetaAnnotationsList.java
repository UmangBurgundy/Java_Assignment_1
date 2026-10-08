import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Inherited
@interface MyAnnotation {
    String value() default "default";
}

@MyAnnotation("Applied to class")
public class S01_Q06_MetaAnnotationsList {

    @MyAnnotation("Applied to method")
    public void annotatedMethod() {
        System.out.println("Method with annotation");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("@Retention - specifies how long annotation is retained");
        System.out.println("@Target - specifies where annotation can be applied");
        System.out.println("@Documented - includes annotation in Javadoc");
        System.out.println("@Inherited - allows subclass to inherit annotation");
        System.out.println("@Repeatable - allows annotation to be applied multiple times");

        MyAnnotation classAnnotation = S01_Q06_MetaAnnotationsList.class.getAnnotation(MyAnnotation.class);
        System.out.println("Class annotation value: " + classAnnotation.value());

        MyAnnotation methodAnnotation = S01_Q06_MetaAnnotationsList.class
                .getMethod("annotatedMethod").getAnnotation(MyAnnotation.class);
        System.out.println("Method annotation value: " + methodAnnotation.value());
    }
}
