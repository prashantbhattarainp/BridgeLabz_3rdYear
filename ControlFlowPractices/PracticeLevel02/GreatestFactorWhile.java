// Class GreatestFactorWhile finds the greatest factor of a number besides itself using a while loop
import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Initialize counter starting from number - 1
        int counter = number - 1;

        // Loop while counter is greater than 0
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop once greatest factor is found
            }
            counter--; // Decrement counter
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
