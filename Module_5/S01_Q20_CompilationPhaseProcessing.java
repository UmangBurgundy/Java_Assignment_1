import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface CompileTimeCheck {
    String value() default "Processed by annotation processor at compile time";
}

public class S01_Q20_CompilationPhaseProcessing {

    @Override
    public String toString() {
        return "CompilationPhaseProcessing";
    }

    @SuppressWarnings("unchecked")
    public void example() {
        java.util.List list = new java.util.ArrayList();
        list.add("test");
    }

    @CompileTimeCheck("custom check")
    public void customChecked() {
        System.out.println("Custom annotation processed during compilation");
    }

    public static void main(String[] args) {
        System.out.println("Annotations processed during compilation phase:");
        System.out.println("1. @Override - compiler verifies method overriding");
        System.out.println("2. @SuppressWarnings - compiler suppresses specific warnings");
        System.out.println("3. @Deprecated - compiler generates warning on usage");
        System.out.println("4. Custom SOURCE annotations - processed by annotation processors");
        System.out.println();
        System.out.println("Annotation processors use javax.annotation.processing.Processor");
        System.out.println("They run during compilation via -processor flag or META-INF/services");
    }
}
