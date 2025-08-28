import java.util.Scanner;

public class ZaraBonus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input for each employee
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double s = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Try again.");
                i--; // retry same employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Bonus calculation
        for (int i = 0; i < EMP_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Salary & Bonus Details ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Company Summary ---");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
