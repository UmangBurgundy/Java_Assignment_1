public class Q8CustomExceptionDemo {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is invalid. Must be 18 or older.");
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }

    public static void main(String[] args) {
        int[] testAges = {22, 15, 18};

        for (int age : testAges) {
            try {
                System.out.println("Checking age: " + age);
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
            System.out.println("----------------------------------");
        }
    }
}
