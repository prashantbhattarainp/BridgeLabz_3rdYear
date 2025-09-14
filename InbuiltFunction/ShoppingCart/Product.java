package InbuiltFunction.ShoppingCart;

public class Product {
    // Static variable shared by all products
    private static double discount = 0.0;

    // Instance variables
    private final String productID; // Final variable
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize variables
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0.0 && newDiscount <= 100.0) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount. Must be between 0 and 100.");
        }
    }

    // Method to calculate price after discount
    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        } else {
            System.out.println("This object is not a Product instance.");
        }
    }

    // Getters and setters (optional)
    public String getProductID() { return productID; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
