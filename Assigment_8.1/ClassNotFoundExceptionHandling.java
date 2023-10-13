public class ClassNotFoundExceptionHandling {
    public static void main(String[] args) {
        String className = "NonExistentClass";

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found - " + e.getMessage());
        }
    }
}
