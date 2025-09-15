package Encapsulation_Polymorphism_Interface_AbstractClass.Ecommerce;


public class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size == null || size.isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty.");
        }
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        // Example: 20% discount
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // Example: 5% VAT
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Tax (Clothing 5% VAT)";
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Clothing");
        System.out.println("Size: " + getSize());
    }
}
