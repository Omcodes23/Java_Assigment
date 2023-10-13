
public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println("Length of str: " + length);
        } catch (NullPointerException e) {
            System.err.println("Error: NullPointerException - The string is null.");
        }
    }
}
