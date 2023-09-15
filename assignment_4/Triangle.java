class Triangle {
    static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 10.0;
        double height = 5.0;

        double area = Triangle.calculateArea(base, height);
        System.out.println("Triangle Area: " + area);
    }
}
