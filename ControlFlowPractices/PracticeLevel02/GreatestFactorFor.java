// Class GreatestFactorFor finds the greatest factor of a number besides itself using a for loop
import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit loop once greatest factor is found
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

 
    }
}
