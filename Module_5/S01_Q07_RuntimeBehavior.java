import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunThis {
    int times() default 1;
}

public class S01_Q07_RuntimeBehavior {

    @RunThis(times = 3)
    public void repeatableTask() {
        System.out.println("Task executed!");
    }

    public void normalTask() {
        System.out.println("Normal task");
    }

    public static void main(String[] args) throws Exception {
        S01_Q07_RuntimeBehavior obj = new S01_Q07_RuntimeBehavior();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunThis.class)) {
                RunThis annotation = method.getAnnotation(RunThis.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(obj);
                }
            }
        }
    }
}
