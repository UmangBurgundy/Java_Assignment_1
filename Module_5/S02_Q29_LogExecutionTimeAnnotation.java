import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

public class S02_Q29_LogExecutionTimeAnnotation {

    @LogExecutionTime
    public void fastMethod() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("  Fast method result: " + sum);
    }

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("  Slow method completed");
    }

    public void normalMethod() {
        System.out.println("  Normal method (not logged)");
    }

    public static void main(String[] args) throws Exception {
        S02_Q29_LogExecutionTimeAnnotation obj = new S02_Q29_LogExecutionTimeAnnotation();

        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();
                double ms = (end - start) / 1_000_000.0;
                System.out.println("  " + method.getName() + " took " + String.format("%.2f", ms) + " ms\n");
            }
        }

        obj.normalMethod();
    }
}
