class MyClass {
    private int privateVariable;

    public MyClass(int privateVariable) {
        this.privateVariable = privateVariable; // Using 'this' to access privateVariable
    }

    public void printPrivateVariable() {
        // Accessing privateVariable using 'this'
        System.out.println("Value of privateVariable: " + this.privateVariable);
    }
}

public class UseofThis {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        obj.printPrivateVariable(); // Calls the method to print privateVariable
    }
}
