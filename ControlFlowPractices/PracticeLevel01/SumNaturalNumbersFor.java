// Class SumNaturalNumbersFor computes sum of n natural numbers using for loop and formula
import java.util.Scanner;

class SumNaturalNumbersFor {
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
            // Compute sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both sums
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            // Verify if both sums are equal
            if (sumFor == sumFormula) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is a mismatch in sums.");
            }
        }

    }
}
