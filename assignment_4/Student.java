class Student {
    String name;
    int id;

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.id = 12345;
        System.out.println("Name: " + student.name);
        System.out.println("ID: " + student.id);
    }
}
