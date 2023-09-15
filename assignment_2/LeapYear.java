import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Get the year from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // Check if the year is divisible by 4
        if (year % 4 == 0) {

            // Check if the year is divisible by 100
            if (year % 100 == 0) {

                // Check if the year is divisible by 400
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year.");
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}