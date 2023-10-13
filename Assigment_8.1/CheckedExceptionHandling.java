import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistent.txt");
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error: An IO exception occurred.");
        }
    }
}
