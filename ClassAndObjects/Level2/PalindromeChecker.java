
public class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase for consistent comparison
        String cleanText = text.replaceAll("\\s", "").toLowerCase();

        // Reverse the string
        String reverseText = new StringBuilder(cleanText).reverse().toString();

        // Compare original with reversed
        return cleanText.equals(reverseText);
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println( text + "\" is a Palindrome.");
        } else {
            System.out.println(text + "\" is NOT a Palindrome.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("Madam");
        checker3.displayResult();
    }
}
