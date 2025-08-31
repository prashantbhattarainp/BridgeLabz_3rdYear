import java.util.Scanner;

public class SpringSeason {

    // Method to check if given month/day is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring is March 20 (3/20) to June 20 (6/20)
        if ((month == 3 && day >= 20) ||  // from March 20 onwards
            (month == 4) ||              // all of April
            (month == 5) ||              // all of May
            (month == 6 && day <= 20)) { // until June 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Check and print result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
