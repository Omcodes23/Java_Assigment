// Shape.java
final class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "This is a " + name;
    }
}
