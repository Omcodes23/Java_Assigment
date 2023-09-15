import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the three numbers from the user.
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber = input.nextInt();

        // Find the maximum number.
        int maximumNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));

        // Print the maximum number.
        System.out.println("The maximum number is " + maximumNumber);
    }
}