// Class NaturalNumberSum checks if a number is natural and computes its sum
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum using formula n*(n+1)/2
            int sum = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Number is not natural
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
