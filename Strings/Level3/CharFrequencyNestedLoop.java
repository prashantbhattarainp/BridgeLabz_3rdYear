import java.util.Scanner;

public class CharFrequencyNestedLoop {

    // Method to find frequency of characters using nested loops
    static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();  // store characters
        int[] freq = new int[chars.length]; // store frequency
        int length = chars.length;

        // Outer loop for each character
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // skip already counted

            freq[i] = 1; // initialize frequency

            // Inner loop to check duplicates
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate as visited
                }
            }
        }

        // Create 1D String array (char + frequency)
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        String[] result = new String[count];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[idx] = chars[i] + " -> " + freq[i];
                idx++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }
    }
}
