public class MultipleExceptionsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempt to access an out-of-bounds array element and divide by zero.
            int result = numbers[3] / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds.");
        }
    }
}
