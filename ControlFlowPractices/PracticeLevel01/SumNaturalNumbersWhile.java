// Class SumNaturalNumbersWhile computes sum of n natural numbers using while loop and formula
import java.util.Scanner;

class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for n
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is natural
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            // Compute sum using while loop
            int sumWhile = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhile += counter;
                counter++;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both sums
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            // Verify if both sums are equal
            if (sumWhile == sumFormula) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is a mismatch in sums.");
            }
        }
    }
}
