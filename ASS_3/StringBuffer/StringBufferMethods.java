public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append(String s)
        stringBuffer.append(", ");
        stringBuffer.append("World!");
        System.out.println("After append: " + stringBuffer);

        // insert(int offset, String s)
        stringBuffer.insert(5, " there");
        System.out.println("After insert: " + stringBuffer);

        // replace(int startIndex, int endIndex, String str)
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuffer);

        // delete(int startIndex, int endIndex)
        stringBuffer.delete(2, 4);
        System.out.println("After delete: " + stringBuffer);

        // reverse()
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

        // capacity()
        System.out.println("Capacity: " + stringBuffer.capacity());

        // ensureCapacity(int minimumCapacity)
        stringBuffer.ensureCapacity(20);

        // charAt(int index)
        System.out.println("Character at index 3: " + stringBuffer.charAt(3));

        // length()
        System.out.println("Length: " + stringBuffer.length());

        // substring(int beginIndex)
        String substring = stringBuffer.substring(6);
        System.out.println("Substring from index 6: " + substring);
    }
}
