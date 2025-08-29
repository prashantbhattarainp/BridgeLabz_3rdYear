import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
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

        // Take input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Take start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Get substring using charAt()
        String customSub = customSubstring(text, start, end);

        // Get substring using built-in substring()
        String builtInSub = text.substring(start, end);

        // Compare both substrings
        boolean areEqual = compareStrings(customSub, builtInSub);

        // Display results
        System.out.println("\nCustom Substring (charAt): " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);

    }
}
