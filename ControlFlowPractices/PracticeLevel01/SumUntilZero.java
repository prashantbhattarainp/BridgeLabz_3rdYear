// Class SumUntilZero calculates the sum of numbers until user enters 0
import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;

        while (true) {
            // Ask user to enter a number
            System.out.print("Enter a number (0 to stop): ");
            double number = input.nextDouble();

            // Break the loop if user enters 0
            if (number == 0) {
                break;
            }

            // Add number to total sum
            total += number;
        }

        // Print the total sum
        System.out.println("The total sum of entered numbers is: " + total);

    }
}
