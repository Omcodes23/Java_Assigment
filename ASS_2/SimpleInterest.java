import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the time period:");
        double time = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
		
        System.out.println("The simple interest is " + simpleInterest);
    }
}