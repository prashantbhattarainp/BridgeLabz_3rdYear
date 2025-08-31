import java.util.Scanner;

public class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Condition: Year must be >= 1582 (Gregorian calendar)
        if (year < 1582) {
            return false;
        }

        // Leap year rules:
        // Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Validate and check leap year
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
