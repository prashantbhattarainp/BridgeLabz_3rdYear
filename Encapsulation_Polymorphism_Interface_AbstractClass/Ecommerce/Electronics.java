package Encapsulation_Polymorphism_Interface_AbstractClass.Ecommerce;

public class Electronics extends Product implements Taxable {
    private double warrantyYears;

    public Electronics(String productId, String name, double price, double warrantyYears) {
        super(productId, name, price);
        setWarrantyYears(warrantyYears);
    }

    public double getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(double warrantyYears) {
        if (warrantyYears < 0) {
            throw new IllegalArgumentException("Warranty years cannot be negative.");
        }
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        // Example: 10% discount
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // Example: 18% GST
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Tax (Electronics 18% GST)";
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Electronics");
        System.out.println("Warranty: " + getWarrantyYears() + " years");
    }
}
