class Square {
    double side;

    void setSide(double s) {
        side = s;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5.0);

        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();

        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }
}
