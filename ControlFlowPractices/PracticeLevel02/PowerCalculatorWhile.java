// Class PowerCalculatorWhile calculates the power of a number using a while loop
import java.util.Scanner;

class PowerCalculatorWhile {
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
            // Initialize result variable and counter
            long result = 1;
            int counter = 1;

            // Loop to calculate power
            while (counter <= power) {
                result *= base;
                counter++; // Increment counter
            }

            // Print the result
            System.out.println(base + " raised to the power " + power + " is: " + result);
        }
    }
}
