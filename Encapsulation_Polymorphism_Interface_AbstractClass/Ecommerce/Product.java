package Encapsulation_Polymorphism_Interface_AbstractClass.Ecommerce;

// Abstract class for common product properties
public abstract class Product {
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    // Encapsulation: Getters & Setters with validation
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty.");
        }
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    // Abstract method for discount
    public abstract double calculateDiscount();

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }
}
