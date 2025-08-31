import java.util.*;

public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(Math.abs(num));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;  // if any 0 is present (not in leading digit)
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count digits
        int count = countDigits(num);
        System.out.println("Digit Count: " + count);

        // Get digits
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Duck number check
        System.out.println("Duck Number: " + isDuckNumber(digits));

        // Armstrong check
        System.out.println("Armstrong Number: " + isArmstrong(num, digits));

        // Largest and second largest
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        // Smallest and second smallest
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);

        sc.close();
    }
}
