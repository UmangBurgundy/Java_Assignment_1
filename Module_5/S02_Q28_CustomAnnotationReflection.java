import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    int order() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
    String value();
}

class Service {
    @Inject("DatabaseService")
    private String dbService;

    @Inject("CacheService")
    private String cacheService;

    @Execute(order = 1)
    public void init() {
        System.out.println("  Initializing with " + dbService + " and " + cacheService);
    }

    @Execute(order = 2)
    public void process() {
        System.out.println("  Processing data...");
    }

    @Execute(order = 3)
    public void cleanup() {
        System.out.println("  Cleaning up resources...");
    }
}

public class S02_Q28_CustomAnnotationReflection {

    public static void main(String[] args) throws Exception {
        Service service = new Service();

        for (Field field : service.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Inject inject = field.getAnnotation(Inject.class);
                field.set(service, inject.value());
                System.out.println("Injected: " + field.getName() + " = " + inject.value());
            }
        }

        System.out.println("\nExecuting methods by order:");
        Method[] methods = service.getClass().getDeclaredMethods();
        java.util.Arrays.sort(methods, (a, b) -> {
            Execute ea = a.getAnnotation(Execute.class);
            Execute eb = b.getAnnotation(Execute.class);
            int orderA = (ea != null) ? ea.order() : Integer.MAX_VALUE;
            int orderB = (eb != null) ? eb.order() : Integer.MAX_VALUE;
            return orderA - orderB;
        });

        for (Method method : methods) {
            if (method.isAnnotationPresent(Execute.class)) {
                Execute exec = method.getAnnotation(Execute.class);
                System.out.println("Order " + exec.order() + ": " + method.getName());
                method.invoke(service);
            }
        }
    }
}
