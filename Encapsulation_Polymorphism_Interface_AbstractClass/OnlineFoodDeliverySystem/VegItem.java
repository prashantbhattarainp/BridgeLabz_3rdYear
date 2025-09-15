package Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charge for veg
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
        return "Veg items are eligible for discounts up to 20%.";
    }
}

