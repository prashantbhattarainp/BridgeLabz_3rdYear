import java.util.Scanner;

public class NullPointerDemo {

    // Method to generate NullPointerException (without handling)
    static void generateException() {
        String text = null; // initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    static void handleException() {
        String text = null; // initialized to null
        try {
            // Trying to access a method of null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating Exception ----");
        try {
            generateException();   // This will throw the exception
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(); // This method already handles it with try-catch
    }
}
