import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison
    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive comparison
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // base case
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper: Reverse a string using charAt()
    static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[index++] = text.charAt(i);
        }
        return reversed;
    }

    // Logic 3: Using character arrays
    static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");

        // Logic 1
        if (isPalindromeIterative(text)) {
            System.out.println("Logic 1 (Iterative): Palindrome");
        } else {
            System.out.println("Logic 1 (Iterative): Not Palindrome");
        }

        // Logic 2
        if (isPalindromeRecursive(text, 0, text.length() - 1)) {
            System.out.println("Logic 2 (Recursive): Palindrome");
        } else {
            System.out.println("Logic 2 (Recursive): Not Palindrome");
        }

        // Logic 3
        if (isPalindromeUsingArrays(text)) {
            System.out.println("Logic 3 (Char Array): Palindrome");
        } else {
            System.out.println("Logic 3 (Char Array): Not Palindrome");
        }
    }
}
