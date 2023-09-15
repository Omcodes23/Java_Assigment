interface Shape {
    double area();
}

class Triangle implements Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceAbstract {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        System.out.println("Area of Triangle: " + triangle.area());

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
    }
}
