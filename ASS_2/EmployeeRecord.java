import java.util.Scanner;

public class EmployeeRecord {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the employee's age:");
        int age = scanner.nextInt();

        System.out.println("Enter the employee's salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the employee's sex (M/F):");
        char sex = scanner.next().charAt(0);

        System.out.println("Employee record:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Sex: " + sex);
    }
}