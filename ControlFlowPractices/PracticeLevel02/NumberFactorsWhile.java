// Class NumberFactorsWhile prints all factors of a positive integer using a while loop
import java.util.Scanner;

class NumberFactorsWhile {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Initialize counter for while loop
            int counter = 1;

            // Loop to find factors
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // Increment counter
            }
        }

        // Close the Scanner
        input.close();
    }
}
