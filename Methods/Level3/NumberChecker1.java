import java.util.*;

public class NumberChecker1 {

    // Method to find count of digits
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits of number in array
    public static int[] getDigits(int num) {
        String str = String.valueOf(Math.abs(num));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of digits
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // 0–9 digits
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many unique digits are present
        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        // Store in 2D array [digit, frequency]
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
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

        // Step 3: Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        // Step 4: Sum of squares
        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumSq);

        // Step 5: Harshad number check
        System.out.println("Harshad Number: " + isHarshad(num, digits));

        // Step 6: Digit frequency
        int[][] freqTable = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : freqTable) {
            System.out.println(row[0] + " : " + row[1]);
        }

        sc.close();
    }
}
