public class ReplaceExample {

    public static void main(String[] args) {
        String text = "Hello, World!";
        char oldChar = 'o';
        char newChar = 'x';

        String replaced = text.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replaced);
    }
}
