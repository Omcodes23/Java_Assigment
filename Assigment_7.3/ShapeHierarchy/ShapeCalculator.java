// ShapeCalculator.java
public class ShapeCalculator {
    public static void main(String[] args) {
        // Step 5: Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Step 6: Demonstrate method overriding
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
