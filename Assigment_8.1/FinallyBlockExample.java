import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Open a database connection (simulated).
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");

            // Simulate some operations with the database connection.
            // ...
            System.out.println("Database operations completed successfully.");
        } catch (SQLException e) {
            System.err.println("Error: Database operation failed - " + e.getMessage());
        } finally {
            // Ensure that the database connection is always closed.
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed successfully.");
                }
            } catch (SQLException e) {
                System.err.println("Error: Failed to close the database connection - " + e.getMessage());
            }
        }
    }
}
