// Class DigitCounter counts the number of digits in a given integer
import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter an integer to count its digits: ");
        int number = sc.nextInt();

        // Initialize count variable
        int count = 0;

        // Store the original number for display
        int originalNumber = number;

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Loop until number becomes 0
        do {
            number = number / 10; // Remove last digit
            count++;               // Increment digit count
        } while (number != 0);

        // Display the result
        System.out.println("The number of digits in " + originalNumber + " is " + count + ".");
    }
}
