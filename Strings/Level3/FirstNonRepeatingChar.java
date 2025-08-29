import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // frequency array for ASCII characters

        // First pass: count frequencies
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Second pass: find first char with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }

        return '\0'; // return null char if none found
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
