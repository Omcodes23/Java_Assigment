import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);
    }
}