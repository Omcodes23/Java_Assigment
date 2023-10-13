public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String str = "123abc";
        int denominator = 0;

        try {
            int result = Integer.parseInt(str) / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        }
    }
}
