import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + recursiveSum(n - 1); // recursive step
    }

    // Formula method to find sum of n natural numbers
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        // Validation
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
        } else {
            // Using recursion
            int recursiveResult = recursiveSum(n);

            // Using formula
            int formulaResult = formulaSum(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveResult);
            System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaResult);

            // Compare results
            if (recursiveResult == formulaResult) {
                System.out.println("✅ Both computations give the same result!");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}
