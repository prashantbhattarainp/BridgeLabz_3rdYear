// Class NumberSignCheck checks if a number is positive, negative, or zero
import java.util.Scanner;

class NumberSignCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }
}
