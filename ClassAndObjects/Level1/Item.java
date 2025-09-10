public class Item {
    // Fields (Attributes)
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println();
    }

    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("01AA", "Water Bottle", 500);
        Item item2 = new Item("01BB", "Rice", 700);
        Item item3 = new Item("02AA", "Blackboard", 400);

        // Display item details
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();

        // Calculate and display total cost for given quantities
        System.out.println("Total cost of 2 Water Bottles: " + item1.calculateTotalCost(2));
        System.out.println("Total cost of 5 Rice: " + item2.calculateTotalCost(5));
        System.out.println("Total cost of 3 Blackboards: " + item3.calculateTotalCost(3));
    }
}
