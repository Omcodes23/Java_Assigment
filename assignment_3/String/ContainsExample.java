public class ContainsExample {

    public static void main(String[] args) {
        String text = "Hello, World!";
        CharSequence sequence = "World";

        boolean contains = text.contains(sequence);
        System.out.println("Contains 'World': " + contains);
    }
}
