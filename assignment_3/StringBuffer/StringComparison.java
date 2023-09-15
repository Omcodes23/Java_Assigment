public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krina");
        String s4 = "Krupali";

        // Using equals() method
        System.out.println("Using equals() method:");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals s4: " + s1.equals(s4));

        // Using == operator
        System.out.println("\nUsing == operator:");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));

        // Using compareTo() method
        System.out.println("\nUsing compareTo() method:");
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));
        System.out.println("s1 compareTo s3: " + s1.compareTo(s3));
        System.out.println("s1 compareTo s4: " + s1.compareTo(s4));
    }
}
