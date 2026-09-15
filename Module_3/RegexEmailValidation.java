// 25. Regular Expressions in java.util.regex
// Uses Pattern and Matcher classes to check if a given string is a valid email address.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {
    // RFC 5322 compliant simplified regex pattern for standard email addresses
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

        // Test sample list of valid and invalid email addresses
        String[] testEmails = {
            "user@example.com",
            "john.doe@company.org",
            "support-team@sub.domain.co.uk",
            "first_last+tag@mail.net",
            "invalid.email.com",        // missing @
            "@missing-username.com",    // missing username
            "user@.missingdomain.com",  // invalid domain
            "user@domain..com",         // double dot
            "user name@domain.com",     // space in username
            "user@domain"               // missing TLD
        };

        System.out.printf("%-35s | %-10s%n", "Email Address", "Result");
        System.out.println("--------------------------------------------------");

        for (String email : testEmails) {
            boolean valid = isValidEmail(email);
            System.out.printf("%-35s | %s%n", email, valid ? "VALID" : "INVALID");
        }

        // If command-line argument was provided, check it as well
        if (args.length > 0) {
            String customEmail = args[0];
            System.out.println("\nCustom Argument Check:");
            System.out.println("Input: " + customEmail + " -> " + (isValidEmail(customEmail) ? "VALID" : "INVALID"));
        }
    }
}
