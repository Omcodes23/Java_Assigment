class Student12 {
    String name;
    int id;
    static String college = "XYZ College"; // Static variable

    Student12(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student12 student1 = new Student12("Alice", 101);
        student1.display();

        Student12 student2 = new Student12("Bob", 102);
        student2.display();
    }
}
