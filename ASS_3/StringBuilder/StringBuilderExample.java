public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("World!");
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
