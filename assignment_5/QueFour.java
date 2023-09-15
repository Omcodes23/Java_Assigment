abstract class Employee {

    private String name;
    private double paymentPerHour;

    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract double calculateSalary();

    public double getPaymentPerHour() {
        return paymentPerHour;
    }
}

class Contractor extends Employee {

    private double workingHours;

    public Contractor(String name, double paymentPerHour, double workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public double calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }

    public double calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}

public class QueFour {
    public static void main(String[] args) {
        Employee contractor;
        Employee fullTimeEmployee;
        contractor = new Contractor("Ramesh contractor", 10, 5);
        fullTimeEmployee = new FullTimeEmployee("Ramesh full-time employee", 8);

        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}
