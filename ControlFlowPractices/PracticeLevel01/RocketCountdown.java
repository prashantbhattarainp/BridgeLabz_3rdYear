// Class RocketCountdown uses a while loop to count down from a user-specified number
import java.util.Scanner;

class RocketCountdown {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the starting number for the countdown
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Perform countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter
        }

        System.out.println("Lift off!");

        // Close the Scanner
        input.close();
    }
}
