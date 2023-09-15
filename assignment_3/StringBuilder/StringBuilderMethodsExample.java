public class StringBuilderMethodsExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // a) append(String s)
        sb.append(", ");
        sb.append("World!");
        System.out.println("After append: " + sb);

        // b) insert(int offset, String s)
        sb.insert(5, " there");
        System.out.println("After insert: " + sb);

        // c) replace(int startIndex, int endIndex, String str)
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // d) delete(int startIndex, int endIndex)
        sb.delete(2, 4);
        System.out.println("After delete: " + sb);

        // e) reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // f) capacity()
        System.out.println("Capacity: " + sb.capacity());

        // g) ensureCapacity(int minimumCapacity)
        sb.ensureCapacity(20);

        // h) charAt(int index)
        System.out.println("Character at index 3: " + sb.charAt(3));

        // i) length()
        System.out.println("Length: " + sb.length());

        // j) substring(int beginIndex)
        String substring1 = sb.substring(6);
        System.out.println("Substring from index 6: " + substring1);

        // k) substring(int beginIndex, int endIndex)
        String substring2 = sb.substring(0, 2);
        System.out.println("Substring from index 0 to 2: " + substring2);
    }
}
