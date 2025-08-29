import java.util.Scanner;

public class CharFrequencyWithUnique {

    // Method to find unique characters from string using charAt()
    static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop: check every character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop: check if already seen before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Store only unique chars in final array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to calculate frequency of each unique character
    static String[][] findFrequency(String text) {
        int[] freq = new int[256];  // for ASCII characters

        // Count frequency of all characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create result 2D array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display 2D array in tabular form
    static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : arr) {
            System.out.printf("    %s     -    %s\n", row[0], row[1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);
        display(frequency);
    }
}
