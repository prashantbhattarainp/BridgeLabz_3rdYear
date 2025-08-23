// Program DayOfWeek calculates day of the week for a given date
import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Calculate intermediate values using integer division
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of the week: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result
        System.out.println("Day of the week (0=Sunday, 1=Monday, ... 6=Saturday): " + d0);
    }
}
