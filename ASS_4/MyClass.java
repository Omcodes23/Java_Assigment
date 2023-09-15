class MyClass {
    static int count = 0; // Static variable to count objects

    MyClass() {
        count++; // Increment count when an object is created
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        int objectCount = MyClass.getCount();
        System.out.println("Number of objects created: " + objectCount);
    }
}
