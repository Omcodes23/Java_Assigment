// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the "Product" class
        Product product = new Product(1, "Smartphone", 499.99);

        // Displaying the product description
        System.out.println("Product Description:\n" + product.getDescription());

        // Attempting to create an instance of the derived class "DiscountedProduct"
        // DiscountedProduct discountedProduct = new DiscountedProduct(2, "Laptop", 799.99); // Uncommenting this line will result in an error

        // Explanation of why "Product" is marked as final
        System.out.println("\nIn a real-world scenario, the \"Product\" class might be marked as final to prevent further specialization or customization of product types. This ensures that the core properties and behavior of a product remain consistent and cannot be altered by subclasses.");
    }
}
