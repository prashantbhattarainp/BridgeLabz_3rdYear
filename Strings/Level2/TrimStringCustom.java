import java.util.Scanner;

public class TrimStringCustom {

    // Method to find start and end index without leading/trailing spaces
    static int[] findTrimIndices(String text) {
        int start = 0, end = 0;
        int length = 0;

        // Find length without using length()
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        // Find start index (first non-space)
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        // Find end index (last non-space)
        end = length - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;

        try {
            while (true) { s1.charAt(len1); len1++; }
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            while (true) { s2.charAt(len2); len2++; }
        } catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Find trim indices
        int[] indices = findTrimIndices(input);

        // Get custom trimmed string
        String customTrim = customSubstring(input, indices[0], indices[1]);

        // Built-in trimmed string
        String builtinTrim = input.trim();

        // Compare
        boolean isSame = compareStrings(customTrim, builtinTrim);

        // Display
        System.out.println("\nCustom Trimmed String: \"" + customTrim + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtinTrim + "\"");
        System.out.println("Do both match? " + isSame);
    }
}
