// Class PowerCalculator calculates the power of a number using a for loop
import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the base number
        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        // Get input value for the exponent (power)
        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        // Check if the power is a positive integer
        if (power < 0) {
            System.out.println("Power must be a positive integer.");
        } else {
            // Initialize result variable
            long result = 1;

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= base;
            }

            // Print the result
            System.out.println(base + " raised to the power " + power + " is: " + result);
        }
    }
}
