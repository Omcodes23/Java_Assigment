class Student4 {
    String name;
    int id;

    void setValues(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student4 student1 = new Student4();
        student1.setValues("Alice", 101);
        student1.display();

        Student4 student2 = new Student4();
        student2.setValues("Bob", 102);
        student2.display();
    }
}
