// Class LeapYearSingleIfLogical checks if a year is a leap year using a single if with logical operators
import java.util.Scanner;

class LeapYearSingleIfLogical {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Single if statement with logical AND (&&) and OR (||) to check leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be 1582 or later for Gregorian calendar.");
        }
    }
}
