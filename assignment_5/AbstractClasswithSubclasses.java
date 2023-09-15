abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClasswithSubclasses {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        System.out.println("Area of Triangle: " + triangle.area());

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
    }
}
