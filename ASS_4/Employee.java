class Employee {
    int id;
    String name;
    double salary;

    void setValues(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setValues(101, "Alice");
        emp1.salary = 50000.0;

        Employee emp2 = new Employee();
        emp2.setValues(102, "Bob");
        emp2.salary = 60000.0;

        Employee emp3 = new Employee();
        emp3.setValues(103, "Charlie");
        emp3.salary = 55000.0;

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
