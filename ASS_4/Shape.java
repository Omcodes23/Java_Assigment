class Shape {
    double area;

    Shape(double side) {
        area = side * side; // For Square
    }

    Shape(double length, double width) {
        area = length * width; // For Rectangle
    }

    Shape(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            area = 0.5 * base * height; // For Triangle
        }
    }

    Shape(double radius, boolean isCircle) {
        if (isCircle) {
            area = Math.PI * radius * radius; // For Circle
        }
    }

    double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Shape square = new Shape(5.0);
        System.out.println("Square Area: " + square.getArea());

        Shape rectangle = new Shape(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape triangle = new Shape(8.0, 10.0, true);
        System.out.println("Triangle Area: " + triangle.getArea());

        Shape circle = new Shape(3.0, true);
        System.out.println("Circle Area: " + circle.getArea());
    }
}
