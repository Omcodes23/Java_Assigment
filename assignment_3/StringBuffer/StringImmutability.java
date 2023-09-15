public class StringImmutability {
    public static void main(String[] args) {
        String givenName = "John";
        String fullName = givenName + " Doe"; // Concatenating surname to the given name

        System.out.println("Original givenName: " + givenName);
        System.out.println("Original fullName: " + fullName);

        // Modify the given name
        givenName = "Alice";

        System.out.println("Modified givenName: " + givenName);
        System.out.println("Updated fullName: " + fullName); // The fullName remains unchanged

        // Proof that a new string object is created
        System.out.println("Is fullName reference equal to givenName + ' Doe'? " + (fullName == (givenName + " Doe")));
        System.out.println("Is fullName reference equal to 'Alice Doe'? " + (fullName == "Alice Doe"));
    }
}
