import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    static void generateException(String text) {
        // Trying to access an index beyond the string length
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    static void handleException(String text) {
        try {
            // Trying to access an index beyond the string length
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
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
            generateException(userInput); // will crash if not caught
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(userInput); // handles safely
    }
}
