package Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 50.0; // fixed extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE; // includes extra charge
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");
        }
        double discount = calculateTotalPrice() * (discountPercentage / 100);
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg items include an additional charge of Rs." + NON_VEG_CHARGE;
    }
}

