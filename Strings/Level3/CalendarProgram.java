import java.util.Scanner;

public class CalendarProgram {

    // Month names
    static String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Number of days in each month
    static int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Check for leap year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Zeller’s congruence (Gregorian calendar) to find first day of month
    static int firstDayOfMonth(int month, int year) {
        int d = 1; // first day of month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7; // Sunday=0, Monday=1, ...
    }

    // Print Calendar
    static void printCalendar(int month, int year) {
        // Adjust days for February in leap years
        if (month == 2 && isLeapYear(year)) {
            days[2] = 29;
        } else {
            days[2] = 28;
        }

        // Print month and year header
        System.out.println("     " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // First day of the month
        int startDay = firstDayOfMonth(month, year);

        // Indentation for first row
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= days[month]; day++) {
            System.out.printf("%4d", day);

            // Break line after Saturday
            if (((day + startDay) % 7 == 0) || (day == days[month])) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Print calendar
        printCalendar(month, year);

        sc.close();
    }
}
