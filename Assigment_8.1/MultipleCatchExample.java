public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempt to access an out-of-bounds array element and divide by zero.
            int result = numbers[3] / denominator;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.err.println("Parent Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
        }
    }
}
