import java.util.Scanner;

class StringToCharArrayComparison {

    // User-defined method to return characters of a string
    static char[] customToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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

        // Get char array using user-defined method
        char[] customChars = customToCharArray(text);

        // Get char array using built-in toCharArray()
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        // Display results
        System.out.print("\nCustom Char Array: ");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in Char Array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + areEqual);

    }
}
