import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("The first number after swapping is " + firstNumber);
        System.out.println("The second number after swapping is " + secondNumber);
    }
}