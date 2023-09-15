import java.util.Scanner;

public class WriteName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the user's name.
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        // Print the user's name 10 times.
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}