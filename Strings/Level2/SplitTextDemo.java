import java.util.Scanner;

public class SplitTextDemo {

    // Method to find the length of a String without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exit when out of range
        }
        return count;
    }

    // Method to split the text into words without using split()
    static String[] manualSplit(String text) {
        int length = findLength(text);

        // Step 1: Count words by counting spaces
        int wordCount = 1; // at least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount + 1]; 
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[++index] = i;
            }
        }
        spaceIndexes[wordCount] = length; // last word ends at end of text

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                if (text.charAt(j) != ' ') { 
                    sb.append(text.charAt(j));
                }
            }
            words[i] = sb.toString();
            start = end + 1; // move start after space
        }

        return words;
    }

    // Method to compare two string arrays
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manualWords = manualSplit(text);

        // Built-in split
        String[] builtinWords = text.split(" ");

        // Compare arrays
        boolean result = compareArrays(manualWords, builtinWords);

        // Display results
        System.out.println("\nUser-defined split result:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + result);
    }
}
