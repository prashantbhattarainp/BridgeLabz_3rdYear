import java.util.Scanner;

class Purchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs: unit price and quantity
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Compute total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice 
                           + " if the quantity is " + quantity 
                           + " and unit price is INR " + unitPrice);
    }
}
