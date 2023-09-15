class Circle {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.0);

        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
    }
}
