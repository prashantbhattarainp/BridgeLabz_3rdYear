// Class NumberFactors prints all factors of a positive integer using a for loop
import java.util.Scanner;

class NumberFactors {
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

            // Loop from 1 to number to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
