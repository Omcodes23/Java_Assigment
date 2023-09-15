public class Student2 {
    String name;
    int id;

    public void setValues(String n, int i) {
        name = n;
        id = i;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student2 student = new Student2();
        student.setValues("Alice", 98765);
        student.display();
    }
}
