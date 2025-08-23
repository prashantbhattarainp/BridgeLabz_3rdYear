// Class HarshadNumberChecker checks if a given number is a Harshad number
import java.util.Scanner;

class HarshadNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number to check if it is a Harshad number: ");
        int number = sc.nextInt();

        // Initialize sum variable to 0
        int sum = 0;

        // Store original number in a separate variable
        int originalNumber = number;

        // Make sure number is positive for digit extraction
        if (number < 0) {
            number = -number;
        }

        // Loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Extract last digit
            sum += digit;            // Add digit to sum
            number = number / 10;    // Remove last digit
        }

        // Check if the original number is divisible by sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
