// Class FactorialWhile computes factorial of a positive integer using while loop
import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial result
            long factorial = 1;
            int counter = 1;

            // Compute factorial using while loop
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
