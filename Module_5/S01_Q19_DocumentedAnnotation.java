import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DocumentedMethod {
    String description();
    String since() default "1.0";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface UndocumentedMethod {
    String description();
}

public class S01_Q19_DocumentedAnnotation {

    @DocumentedMethod(description = "This will appear in Javadoc", since = "2.0")
    public void documentedMethod() {
        System.out.println("@Documented makes annotation appear in Javadoc");
    }

    @UndocumentedMethod(description = "This will NOT appear in Javadoc")
    public void undocumentedMethod() {
        System.out.println("Without @Documented, annotation is hidden from Javadoc");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("@Documented meta-annotation includes the annotation");
        System.out.println("information in the generated Javadoc documentation.");
        System.out.println();

        DocumentedMethod dm = S01_Q19_DocumentedAnnotation.class
                .getMethod("documentedMethod").getAnnotation(DocumentedMethod.class);
        System.out.println("Description: " + dm.description());
        System.out.println("Since: " + dm.since());
    }
}
