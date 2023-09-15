interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
