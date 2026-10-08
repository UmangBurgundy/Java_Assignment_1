import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String author();
    String date();
}

public class S01_Q01_AnnotationsPurpose {

    @Info(author = "Umang", date = "2026-10-08")
    public void display() {
        System.out.println("Annotations provide metadata about the program.");
        System.out.println("They do not directly affect the code execution.");
        System.out.println("Used by compiler, runtime, or tools for processing.");
    }

    public static void main(String[] args) throws Exception {
        S01_Q01_AnnotationsPurpose obj = new S01_Q01_AnnotationsPurpose();
        obj.display();
        Info info = obj.getClass().getMethod("display").getAnnotation(Info.class);
        System.out.println("Author: " + info.author());
        System.out.println("Date: " + info.date());
    }
}
