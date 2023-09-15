class Student6 {
    String name;
    int id;

    Student6(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student6 student = new Student6("Alice", 123);
        student.display();
    }
}
