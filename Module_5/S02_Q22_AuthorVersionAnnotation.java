import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface AuthorInfo {
    String author();
    String version() default "1.0";
    String date() default "Unknown";
}

@AuthorInfo(author = "Umang Jain", version = "2.1", date = "2026-10-08")
class ProjectA {
}

@AuthorInfo(author = "Team Dev", version = "1.0")
class ProjectB {
}

public class S02_Q22_AuthorVersionAnnotation {

    public static void printInfo(Class<?> clazz) {
        if (clazz.isAnnotationPresent(AuthorInfo.class)) {
            AuthorInfo info = clazz.getAnnotation(AuthorInfo.class);
            System.out.println("Class: " + clazz.getSimpleName());
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
            System.out.println("Date: " + info.date());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printInfo(ProjectA.class);
        printInfo(ProjectB.class);
    }
}
