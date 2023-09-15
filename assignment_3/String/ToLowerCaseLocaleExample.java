import java.util.Locale;

public class ToLowerCaseLocaleExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Locale locale = Locale.US;
        String lowercaseStr = str.toLowerCase(locale);
        System.out.println("Original string: " + str);
        System.out.println("Lowercase string using locale: " + lowercaseStr);
    }
}
