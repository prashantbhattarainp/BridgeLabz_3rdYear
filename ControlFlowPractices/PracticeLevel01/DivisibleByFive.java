// Class DivisibleByFive checks if a number is divisible by 5
import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user and store in number variable
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5 using modulus operator
        boolean isDivisible = (number % 5 == 0);

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

    }
}
