import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
@interface MetaExample {
    String value() default "Meta-annotations are annotations applied to other annotations";
}

@MetaExample
public class S01_Q05_MetaAnnotations {

    public static void main(String[] args) {
        MetaExample annotation = S01_Q05_MetaAnnotations.class.getAnnotation(MetaExample.class);
        System.out.println(annotation.value());
        System.out.println("Meta-annotations: @Retention, @Target, @Documented, @Inherited, @Repeatable");
    }
}
