package InbuiltFunction.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        // Update discount for all products
        Product.updateDiscount(10.0); // 10% discount

        // Create product instances
        Product product1 = new Product("P001", "Laptop", 1200.00, 5);
        Product product2 = new Product("P002", "Smartphone", 800.00, 10);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();
        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
    }
}
