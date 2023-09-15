public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int length = 0;

        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("Length: " + length);
    }
}
