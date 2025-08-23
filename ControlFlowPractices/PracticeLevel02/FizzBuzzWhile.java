// Class FizzBuzzWhile prints numbers from 1 to a given number with Fizz, Buzz, or FizzBuzz using while loop
import java.util.Scanner;

class FizzBuzzWhile {
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
            // Initialize counter for while loop
            int counter = 1;

            // Loop from 1 to number
            while (counter <= number) {
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(counter);
                }
                counter++; // Increment counter
            }
        }
    }
}
