// Class OddEvenPrinter prints odd and even numbers from 1 to a user-specified number
import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}
