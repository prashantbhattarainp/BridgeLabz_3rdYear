package Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDeliverySystem;

public class Main {
    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] order = {veg, nonVeg};

        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                System.out.println("Price after 10% discount: " + d.applyDiscount(10));
            }

            System.out.println("---------------------------");
        }
    }
}

