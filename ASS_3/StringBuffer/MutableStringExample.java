public class MutableStringExample {
    public static void main(String[] args) {
        String immutableString = "This is an immutable string.";
        
        // Convert the immutable string to a mutable one using StringBuffer
        StringBuffer mutableStringBuffer = new StringBuffer(immutableString);
        
        // Now you can modify the mutable string
        mutableStringBuffer.append(" You can modify me!");
        
        String mutableString = mutableStringBuffer.toString();
        
        System.out.println(mutableString);
    }
}
