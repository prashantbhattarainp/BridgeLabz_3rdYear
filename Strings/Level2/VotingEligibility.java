import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for n students
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }
        return ages;
    }

    // Method to check voting eligibility
    static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // Eligible
            } else {
                result[i][1] = "false"; // Not eligible
            }
        }
        return result;
    }

    // Method to display 2D array in tabular format
    static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);              // Step 1: Generate ages
        String[][] results = checkEligibility(ages); // Step 2: Check eligibility
        displayResult(results);                    // Step 3: Display
    }
}
