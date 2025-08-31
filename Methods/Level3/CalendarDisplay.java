import java.util.*;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display calendar
        displayCalendar(month, year);

        sc.close();
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        // Print header
        System.out.println("\n      " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // Break line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    // Method to return month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to return days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Leap year check
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    // Method to calculate first day of the month (Zeller’s Congruence)
    public static int getFirstDayOfMonth(int month, int year) {
        int q = 1; // Day of month = 1
        if (month == 1) {
            month = 13;
            year -= 1;
        } else if (month == 2) {
            month = 14;
            year -= 1;
        }

        int k = year % 100;   // Year of the century
        int j = year / 100;   // Zero-based century

        int h = (q + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller’s outcome to: 0=Sunday, 1=Monday...6=Saturday
        int dayOfWeek = ((h + 6) % 7);
        return dayOfWeek;
    }
}

