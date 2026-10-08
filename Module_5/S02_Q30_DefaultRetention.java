import java.lang.annotation.*;

@Target(ElementType.METHOD)
@interface NoRetention {
    String value() default "No @Retention specified";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface WithRetention {
    String value() default "RUNTIME retention specified";
}

public class S02_Q30_DefaultRetention {

    @NoRetention("test")
    public void noRetentionMethod() {
    }

    @WithRetention("test")
    public void withRetentionMethod() {
    }

    public static void main(String[] args) throws Exception {
        boolean noRetention = S02_Q30_DefaultRetention.class
                .getMethod("noRetentionMethod")
                .isAnnotationPresent(NoRetention.class);

        boolean withRetention = S02_Q30_DefaultRetention.class
                .getMethod("withRetentionMethod")
                .isAnnotationPresent(WithRetention.class);

        System.out.println("Without @Retention, annotation available at runtime: " + noRetention);
        System.out.println("With @Retention(RUNTIME), annotation available at runtime: " + withRetention);
        System.out.println();
        System.out.println("Default retention policy is RetentionPolicy.CLASS");
        System.out.println("CLASS means annotation is in .class file but NOT available via reflection");
    }
}
