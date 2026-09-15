import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email.trim());
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("=== Email Validation using java.util.regex (Pattern & Matcher) ===\n");

        String[] testEmails = {
            "user@example.com",
            "john.doe@company.org",
            "support-team@sub.domain.co.uk",
            "first_last+tag@mail.net",
            "invalid.email.com",
            "@missing-username.com",
            "user@.missingdomain.com",
            "user@domain..com",
            "user name@domain.com",
            "user@domain"
        };

        System.out.printf("%-35s | %-10s%n", "Email Address", "Result");
        System.out.println("--------------------------------------------------");

        for (String email : testEmails) {
            boolean valid = isValidEmail(email);
            System.out.printf("%-35s | %s%n", email, valid ? "VALID" : "INVALID");
        }

        if (args.length > 0) {
            String customEmail = args[0];
            System.out.println("\nCustom Argument Check:");
            System.out.println("Input: " + customEmail + " -> " + (isValidEmail(customEmail) ? "VALID" : "INVALID"));
        }
    }
}
