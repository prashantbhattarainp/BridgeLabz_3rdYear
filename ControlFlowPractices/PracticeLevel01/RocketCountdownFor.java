// Class RocketCountdownFor uses a for loop to count down from a user-specified number
import java.util.Scanner;

class RocketCountdownFor {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the starting number for the countdown
        System.out.print("Enter countdown start number: ");
        int startNumber = input.nextInt();

        // Perform countdown using for loop
        for (int counter = startNumber; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("Lift off!");
    }
}
