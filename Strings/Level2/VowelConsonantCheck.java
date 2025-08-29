import java.util.Scanner;

public class VowelConsonantCheck {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    static String checkCharType(char ch) {
        // Convert uppercase to lowercase manually using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // difference between 'A' and 'a' is 32
        }

        // Check if lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to process string and return 2D array {character, type}
    static String[][] analyzeString(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // increases until out of bound
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Method to display 2D array in table format
    static void displayResult(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze
        String[][] result = analyzeString(input);

        // Display
        displayResult(result);
    }
}
