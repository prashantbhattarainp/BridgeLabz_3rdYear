import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    static void generateException(String text) {
        // Start index greater than end index -> IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    static void handleException(String text) {
        try {
            // Start index greater than end index
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException!");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(userInput); // will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(userInput); // handles safely
    }
}
