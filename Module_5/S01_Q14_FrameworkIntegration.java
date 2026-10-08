import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Column {
    String name();
    boolean nullable() default true;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Entity {
    String tableName();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Autowired {
}

@Entity(tableName = "users")
class User {
    @Column(name = "user_id", nullable = false)
    private int id;

    @Column(name = "user_name")
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class S01_Q14_FrameworkIntegration {

    public static void main(String[] args) {
        System.out.println("Spring annotations: @Component, @Autowired, @RequestMapping");
        System.out.println("Hibernate annotations: @Entity, @Table, @Column, @Id");
        System.out.println();

        Entity entity = User.class.getAnnotation(Entity.class);
        System.out.println("Table: " + entity.tableName());

        for (Field field : User.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Column.class)) {
                Column col = field.getAnnotation(Column.class);
                System.out.println("Column: " + col.name() + ", nullable: " + col.nullable());
            }
        }
    }
}
