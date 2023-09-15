public class ImmutableStringExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("World!");
        
        String immutableString = stringBuilder.toString();
        
        System.out.println("Immutable String: " + immutableString);
    }
}
