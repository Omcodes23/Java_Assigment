class Student3 {
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
        new Student3().setValues("Bob", 123); // Anonymous object
        new Student3().display();
    }
}
