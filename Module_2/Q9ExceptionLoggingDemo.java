import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Q9ExceptionLoggingDemo {
    private static final Logger logger = Logger.getLogger(Q9ExceptionLoggingDemo.class.getName());

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is less than 18.");
        }
        System.out.println("Age " + age + " is valid.");
    }

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("app_error.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("Could not configure log file handler: " + e.getMessage());
        }

        int userAge = 16;
        System.out.println("Testing age validation with age: " + userAge);

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
            System.out.println("Logging exception error to file 'app_error.log' using java.util.logging...");
            logger.log(Level.SEVERE, "User age check failed for age: " + userAge, e);
        }
    }
}
