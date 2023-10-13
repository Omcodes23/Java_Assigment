// Main.java
public class Main {
    public static void main(String[] args) {
        // Attempting to create an instance of the "Circle" class
        // Circle circle = new Circle("Circle"); // Uncommenting this line will result in an error

        // An alternative solution to create objects of the "Circle" class
        String circleName = "Circle";
        Shape circle = new Shape(circleName);
        System.out.println(circle.getDescription());
    }
}
