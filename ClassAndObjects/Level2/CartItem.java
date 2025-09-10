
public class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items
    public void addItem(int quantityToAdd) {
        if (quantityToAdd > 0) {
            this.quantity += quantityToAdd;
            System.out.println(" Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
        } else {
            System.out.println(" Quantity to add must be positive.");
        }
    }

    // Method to remove items
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= 0) {
            System.out.println(" Quantity to remove must be positive.");
        } else if (quantityToRemove > this.quantity) {
            System.out.println(" Cannot remove " + quantityToRemove + " of " + this.itemName + 
                               ". Only " + this.quantity + " available.");
        } else {
            this.quantity -= quantityToRemove;
            System.out.println("🗑 Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
        }
    }

    // Method to calculate total cost
    public double totalCost() {
        return this.price * this.quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("🛒 Item: " + this.itemName + 
                           ", Price: $" + this.price + 
                           ", Quantity: " + this.quantity);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating cart item
        CartItem item1 = new CartItem("Laptop", 999.99, 1);
        
        // Display initial details
        item1.displayItem();

        // Adding and removing items
        item1.addItem(2);   // Add 2 laptops
        item1.removeItem(1); // Remove 1 laptop

        // Display final item details
        item1.displayItem();

        // Display total cost
        System.out.println(" Total cost: $" + item1.totalCost());
    }
}
