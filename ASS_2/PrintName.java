import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Entered Name is: " + name);
        
    }
}
