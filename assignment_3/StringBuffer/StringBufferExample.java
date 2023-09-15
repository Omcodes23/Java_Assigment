public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", ");
        stringBuffer.append("World!");
        
        String result = stringBuffer.toString();
        
        System.out.println(result); // Output: Hello, World!
    }
}
