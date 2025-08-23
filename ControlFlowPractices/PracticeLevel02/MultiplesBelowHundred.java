// Class MultiplesBelow100 prints all multiples of a number below 100 using a for loop
import java.util.Scanner;

class MultiplesBelowHundred{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if the number is positive and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("The number must be positive and less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop from 1 to 99 to find multiples
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
