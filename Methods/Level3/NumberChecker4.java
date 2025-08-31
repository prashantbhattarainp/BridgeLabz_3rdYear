import java.util.*;

public class NumberChecker4 {

    // Method to get sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is Perfect
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        return sumOfDivisors(num) == num;
    }

    // Method to check if a number is Abundant
    public static boolean isAbundant(int num) {
        if (num <= 0) return false;
        return sumOfDivisors(num) > num;
    }

    // Method to check if a number is Deficient
    public static boolean isDeficient(int num) {
        if (num <= 0) return false;
        return sumOfDivisors(num) < num;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is Strong
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));

        sc.close();
    }
}
