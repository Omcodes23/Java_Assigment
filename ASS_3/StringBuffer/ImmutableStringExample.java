public class ImmutableStringExample {
    public static void main(String[] args) {
        StringBuffer mutableStringBuffer = new StringBuffer("This is a mutable string.");
      
        String immutableString = mutableStringBuffer.toString();
      
        System.out.println(immutableString);
    }
}
