import java.util.Scanner;

public class NumberCheck {

    // Method to check number type
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // Positive
        } else if (num < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call method and check result
        int result = checkNumber(num);

        if (result == 1) {
            System.out.println(num + " is Positive.");
        } else if (result == -1) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
