import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of string without using length()
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when out of bound
                count++;
            }
        } catch (Exception e) {
            // exception ends loop
        }
        return count;
    }

    // Method to find unique characters
    static char[] findUniqueChars(String text) {
        int len = getLength(text);
        char[] temp = new char[len]; // to store possible unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // check if already present
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

        // Create final array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method to display result
    static void displayUniqueChars(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] uniqueChars = findUniqueChars(text);
        displayUniqueChars(uniqueChars);
    }
}
