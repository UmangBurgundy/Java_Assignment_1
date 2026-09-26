import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class S02_Q01_JavaUtilPackage {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        ArrayList<String> utilities = new ArrayList<>();
        utilities.add("Data Structures (Collections Framework)");
        utilities.add("Date and Time Facilities");
        utilities.add("Random Number Generation");

        System.out.println("Current Date: " + currentDate);
        System.out.println("Random Value: " + randomNumber);
        System.out.println("Key Features in java.util: " + utilities);
    }
}
