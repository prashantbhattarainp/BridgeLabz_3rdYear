import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using ASCII logic
    static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // difference between ASCII values
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String userDefinedUpper = convertToUpperCase(text);

        // Built-in method conversion
        String builtInUpper = text.toUpperCase();

        // Compare the two
        boolean isSame = compareStrings(userDefinedUpper, builtInUpper);

        // Display results
        System.out.println("\nUser-defined Uppercase: " + userDefinedUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results the same? " + isSame);
    }
}
