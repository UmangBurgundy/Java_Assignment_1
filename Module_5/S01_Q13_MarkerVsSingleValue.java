import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MarkerAnnotation {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SingleValueAnnotation {
    String value();
}

public class S01_Q13_MarkerVsSingleValue {

    @MarkerAnnotation
    public void markerMethod() {
        System.out.println("Marker annotation has no elements");
    }

    @SingleValueAnnotation("Hello")
    public void singleValueMethod() {
        System.out.println("Single-value annotation has exactly one element");
    }

    public static void main(String[] args) throws Exception {
        S01_Q13_MarkerVsSingleValue obj = new S01_Q13_MarkerVsSingleValue();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MarkerAnnotation.class)) {
                System.out.print("Marker: ");
                method.invoke(obj);
            }
            if (method.isAnnotationPresent(SingleValueAnnotation.class)) {
                SingleValueAnnotation sva = method.getAnnotation(SingleValueAnnotation.class);
                System.out.print("Single-value (" + sva.value() + "): ");
                method.invoke(obj);
            }
        }
    }
}
