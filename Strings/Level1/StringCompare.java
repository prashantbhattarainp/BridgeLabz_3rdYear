import java.util.Scanner;

public class StringCompare {
    
    // Method to compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {
        // If lengths are different, they can't be equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean manualCompare = compareStrings(str1, str2);

        // Compare using equals()
        boolean builtInCompare = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + manualCompare);
        System.out.println("Comparison using equals(): " + builtInCompare);

        // Check if both methods give the same result
        if (manualCompare == builtInCompare) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Results are DIFFERENT.");
        }

    }
}

