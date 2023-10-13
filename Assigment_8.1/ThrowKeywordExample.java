public class ThrowKeywordExample {
    public static void main(String[] args) {
        try {
            checkAge(20);
            System.out.println("Age is valid.");

            checkAge(15);
            System.out.println("Age is valid.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }
}
