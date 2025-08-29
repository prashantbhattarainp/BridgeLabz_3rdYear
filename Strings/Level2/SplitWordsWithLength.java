import java.util.Scanner;

public class SplitWordsWithLength {

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when index goes out of bounds
        }
        return count;
    }

    // Method to split text into words without using split()
    static String[] manualSplit(String text) {
        int length = findLength(text);

        // Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = sb.toString();
                sb.setLength(0); // reset builder
            } else {
                sb.append(ch);
            }
        }
        words[index] = sb.toString(); // last word

        return words;
    }

    // Method to return 2D array {word, length}
    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split words
        String[] words = manualSplit(text);

        // Create 2D array {word, length}
        String[][] wordTable = wordsWithLength(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int len = Integer.parseInt(wordTable[i][1]); // convert back to integer
            System.out.println(word + "\t" + len);
        }
    }
}
