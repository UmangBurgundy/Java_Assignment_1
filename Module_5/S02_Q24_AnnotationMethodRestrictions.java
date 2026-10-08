import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ValidMethod {
    String returnType() default "String";
    int priority() default 0;
    Class<?> handler() default Object.class;
    String[] tags() default {};
}

public class S02_Q24_AnnotationMethodRestrictions {

    @ValidMethod(returnType = "int", priority = 5, tags = {"math", "core"})
    public void compute() {
        System.out.println("Computing...");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Restrictions on annotation method definitions:");
        System.out.println("1. Return type must be: primitive, String, Class, enum, annotation, or arrays of these");
        System.out.println("2. Methods cannot have parameters");
        System.out.println("3. Methods cannot throw exceptions");
        System.out.println("4. Methods cannot be generic");
        System.out.println("5. Default values must be compile-time constants");
        System.out.println();

        Method m = S02_Q24_AnnotationMethodRestrictions.class.getMethod("compute");
        ValidMethod vm = m.getAnnotation(ValidMethod.class);
        System.out.println("Return type: " + vm.returnType());
        System.out.println("Priority: " + vm.priority());
        System.out.println("Handler: " + vm.handler().getSimpleName());
        System.out.print("Tags: ");
        for (String tag : vm.tags()) {
            System.out.print(tag + " ");
        }
        System.out.println();
    }
}
