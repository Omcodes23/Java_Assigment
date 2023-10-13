public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access the 6th element, which does not exist.
            int sixthElement = numbers[5];
            System.out.println("Sixth Element: " + sixthElement);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
        }
    }
}
