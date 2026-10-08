import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String taskName();
    String assignedTo();
    int priority() default 1;
}

public class S01_Q09_CustomAnnotationCreation {

    @TaskInfo(taskName = "Database Migration", assignedTo = "Umang", priority = 5)
    public void criticalTask() {
        System.out.println("Executing critical task");
    }

    @TaskInfo(taskName = "Code Review", assignedTo = "Team")
    public void regularTask() {
        System.out.println("Executing regular task");
    }

    public static void main(String[] args) throws Exception {
        S01_Q09_CustomAnnotationCreation obj = new S01_Q09_CustomAnnotationCreation();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = method.getAnnotation(TaskInfo.class);
                System.out.println("Task: " + info.taskName());
                System.out.println("Assigned To: " + info.assignedTo());
                System.out.println("Priority: " + info.priority());
                method.invoke(obj);
                System.out.println();
            }
        }
    }
}
