public class NestedTryCatchExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);

            try {
                // Attempt to access the 6th element, which does not exist.
                int sixthElement = numbers[5];
                System.out.println("Sixth Element: " + sixthElement);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Inner Error: Array index out of bounds.");
            }

        } catch (ArithmeticException e) {
            System.err.println("Outer Error: Division by zero is not allowed.");
        }
    }
}
