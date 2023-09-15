class Parent {
    int value;

    Parent(int value) {
        this.value = value;
    }
}

class Child extends Parent {
    Child(int value) {
        super(value);
    }
}

public class SubclassConstructorInvokingSuperclassConstructor {
    public static void main(String[] args) {
        Child child = new Child(42);
        System.out.println("Value in child: " + child.value);
    }
}
