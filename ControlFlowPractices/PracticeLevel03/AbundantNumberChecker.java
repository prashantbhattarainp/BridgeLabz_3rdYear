// Class AbundantNumberChecker checks if a given number is an Abundant Number
import java.util.Scanner;

class AbundantNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = sc.nextInt();

        // Initialize sum variable to 0
        int sum = 0;

        // Loop to calculate sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor
                sum += i;           // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
