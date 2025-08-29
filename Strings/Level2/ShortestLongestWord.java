import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of string without using length()
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

    // Method to split text into words manually
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
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        words[index] = sb.toString(); // last word

        return words;
    }

    // Method to create 2D array of words and their lengths
    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word
    static String[] findShortestAndLongest(String[][] wordTable) {
        String shortest = wordTable[0][0];
        String longest = wordTable[0][0];
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);

            if (len < minLen) {
                minLen = len;
                shortest = wordTable[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordTable[i][0];
            }
        }

        return new String[]{shortest, String.valueOf(minLen), longest, String.valueOf(maxLen)};
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split words
        String[] words = manualSplit(text);

        // Word with length table
        String[][] wordTable = wordsWithLength(words);

        // Find shortest and longest
        String[] result = findShortestAndLongest(wordTable);

        // Display
        System.out.println("\nWord\tLength");
        System.out.println("------------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word: " + result[2] + " (Length: " + result[3] + ")");
    }
}
