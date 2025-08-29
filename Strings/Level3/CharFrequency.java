import java.util.Scanner;

public class CharFrequency {

    // Method to calculate frequency and return 2D String array
    static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // frequency array for ASCII chars

        // Step 1: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Step 2: Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // mark as processed
                index++;
            }
        }

        return result;
    }

    // Method to display 2D array in tabular form
    static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : arr) {
            System.out.printf("    %s     |    %s\n", row[0], row[1]);
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
