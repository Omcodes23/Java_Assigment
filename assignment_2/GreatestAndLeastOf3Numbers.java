import java.util.Scanner;

public class GreatestAndLeastOf3Numbers {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers.
        System.out.println("Enter three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // Find the greatest number.
        int greatestNumber = Math.max(number1, Math.max(number2, number3));

        // Find the least number.
        int leastNumber = Math.min(number1, Math.min(number2, number3));

        // Print the greatest and least numbers.
        System.out.println("The greatest number is " + greatestNumber);
        System.out.println("The least number is " + leastNumber);
    }
}