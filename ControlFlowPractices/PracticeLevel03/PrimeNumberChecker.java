// Class PrimeNumberChecker checks if a given number is a prime number
import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        // Assume number is prime initially
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number-1 to check for factors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // Number divisible by i, so not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
