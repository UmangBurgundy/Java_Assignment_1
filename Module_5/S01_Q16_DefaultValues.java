import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Schedule {
    String day() default "Monday";
    String time() default "09:00";
    int repeat() default 1;
}

public class S01_Q16_DefaultValues {

    @Schedule
    public void defaultSchedule() {
        System.out.println("Running with all defaults");
    }

    @Schedule(day = "Friday", time = "17:00", repeat = 3)
    public void customSchedule() {
        System.out.println("Running with custom values");
    }

    @Schedule(day = "Wednesday")
    public void partialSchedule() {
        System.out.println("Running with partial custom values");
    }

    public static void main(String[] args) throws Exception {
        S01_Q16_DefaultValues obj = new S01_Q16_DefaultValues();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Schedule.class)) {
                Schedule s = method.getAnnotation(Schedule.class);
                System.out.println(method.getName() + " -> " + s.day() + " at " + s.time() + " x" + s.repeat());
                method.invoke(obj);
                System.out.println();
            }
        }
    }
}
