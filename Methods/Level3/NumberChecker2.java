import java.util.*;

public class NumberChecker2 {

    // Method to count digits in a number
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits of number in an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(Math.abs(num));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to check if two arrays are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check palindrome using digits
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if number is a duck number
    public static boolean isDuckNumber(int num, int[] digits) {
        // Duck number should contain 0 but not start with 0
        if (digits[0] == 0) {
            return false; 
        }
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 1: Count digits
        int count = countDigits(num);
        System.out.println("Digit Count: " + count);

        // Step 2: Get digits
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Step 3: Reverse array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        // Step 4: Check arrays equality
        System.out.println("Digits Equal to Reversed? " + arraysEqual(digits, reversed));

        // Step 5: Palindrome check
        System.out.println("Palindrome: " + isPalindrome(num));

        // Step 6: Duck number check
        System.out.println("Duck Number: " + isDuckNumber(num, digits));

        sc.close();
    }
}
