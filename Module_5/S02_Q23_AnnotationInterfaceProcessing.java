import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestCase {
    String name();
    boolean enabled() default true;
}

public class S02_Q23_AnnotationInterfaceProcessing {

    @TestCase(name = "Test Addition")
    public void testAdd() {
        System.out.println("  2 + 3 = " + (2 + 3));
    }

    @TestCase(name = "Test Subtraction")
    public void testSubtract() {
        System.out.println("  5 - 3 = " + (5 - 3));
    }

    @TestCase(name = "Test Disabled", enabled = false)
    public void testDisabled() {
        System.out.println("  This should not run");
    }

    public static void main(String[] args) throws Exception {
        S02_Q23_AnnotationInterfaceProcessing obj = new S02_Q23_AnnotationInterfaceProcessing();

        for (Method method : obj.getClass().getDeclaredMethods()) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof TestCase) {
                    TestCase tc = (TestCase) annotation;
                    if (tc.enabled()) {
                        System.out.println("Running: " + tc.name());
                        method.invoke(obj);
                    } else {
                        System.out.println("Skipping: " + tc.name());
                    }
                }
            }
        }
    }
}
