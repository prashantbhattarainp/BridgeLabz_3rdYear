// Class ArmstrongNumberChecker checks if a given number is an Armstrong number
import java.util.Scanner;

class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        // Initialize sum variable to 0
        int sum = 0;

        // Store original number in a separate variable
        int originalNumber = number;

        // Loop until originalNumber is not zero
        while (originalNumber != 0) {
            // Get the last digit using modulus
            int digit = originalNumber % 10;

            // Cube the digit and add to sum
            sum += digit * digit * digit;

            // Remove the last digit from originalNumber
            originalNumber = originalNumber / 10;
        }

        // Check if the sum of cubes equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
