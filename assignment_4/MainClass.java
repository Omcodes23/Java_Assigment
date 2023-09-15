public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jane";
        student.id = 54321;

        System.out.println("Name: " + student.name);
        System.out.println("ID: " + student.id);
    }
}
