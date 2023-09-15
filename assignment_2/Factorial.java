import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number to calculate the factorial of.
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Calculate the factorial of the number.
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial of the number.
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}