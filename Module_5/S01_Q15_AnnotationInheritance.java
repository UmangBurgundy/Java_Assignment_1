import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface InheritableAnnotation {
    String value() default "This annotation is inherited";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface NonInheritableAnnotation {
    String value() default "This annotation is NOT inherited";
}

@InheritableAnnotation("Parent class annotation")
@NonInheritableAnnotation("Parent only")
class ParentClass {
}

class ChildClass extends ParentClass {
}

public class S01_Q15_AnnotationInheritance {

    public static void main(String[] args) {
        boolean inheritedPresent = ChildClass.class.isAnnotationPresent(InheritableAnnotation.class);
        boolean nonInheritedPresent = ChildClass.class.isAnnotationPresent(NonInheritableAnnotation.class);

        System.out.println("@Inherited annotation present on child: " + inheritedPresent);
        System.out.println("Non-inherited annotation present on child: " + nonInheritedPresent);

        if (inheritedPresent) {
            InheritableAnnotation a = ChildClass.class.getAnnotation(InheritableAnnotation.class);
            System.out.println("Inherited value: " + a.value());
        }
    }
}
