import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ResourceHandlingExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password")) {

            // Simulate database operations.
            // ...
            System.out.println("Database operations completed successfully.");

        } catch (SQLException e) {
            System.err.println("Error: Database operation failed - " + e.getMessage());
        }
    }
}
