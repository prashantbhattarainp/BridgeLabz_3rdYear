package Encapsulation_Polymorphism_Interface_AbstractClass.Ecommerce;


public class Groceries extends Product {
    private double weight; // in kg

    public Groceries(String productId, String name, double price, double weight) {
        super(productId, name, price);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;
    }

    @Override
    public double calculateDiscount() {
        // Example: 5% discount
        return getPrice() * 0.05;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Category: Groceries");
        System.out.println("Weight: " + getWeight() + " kg");
    }
}
