import calculator.Addition;
import calculator.Subtraction;

public class MainApp {
    public static void main(String[] args) {
        // Testing addition
        int sum = Addition.add(5, 3);
        System.out.println("Sum: " + sum); // Output: Sum: 8

        // Testing subtraction
        int difference = Subtraction.subtract(10, 4);
        System.out.println("Difference: " + difference); // Output: Difference: 6
    }
}
