import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] digits = new int[20];   // store digits of number
        int[] freq = new int[10];     // frequency of digits 0–9
        int index = 0;

        long temp = number;
        while (temp > 0) {
            int digit = (int)(temp % 10);
            digits[index++] = digit;
            freq[digit]++;  // increase count for this digit
            temp /= 10;
        }

        System.out.println("\nDigit Frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " * " + freq[i] + " times");
            }
        }
    }    
}
