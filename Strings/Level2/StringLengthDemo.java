import java.util.Scanner;

public class StringLengthDemo {

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Keep accessing until exception occurs
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using user-defined method
        int userDefinedLength = findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nUser-defined length: " + userDefinedLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Are both equal? " + (userDefinedLength == builtInLength));
    }
}
