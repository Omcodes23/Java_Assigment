public class StringBuilderToBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("World!");
        
        StringBuffer stringBuffer = new StringBuffer(stringBuilder.toString());
        
        System.out.println("Converted StringBuffer: " + stringBuffer);
    }
}
