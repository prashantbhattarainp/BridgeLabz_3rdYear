import java.util.Random;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate Salary & Years of Service
        int[][] employees = generateSalaryAndService(numEmployees);

        // Step 2: Calculate Bonus and New Salary
        double[][] results = calculateBonus(employees);

        // Step 3: Display Results with Totals (Simpler Printing)
        displayResults(results);
    }

    // Method to generate salary (5-digit) and years of service
    public static int[][] generateSalaryAndService(int size) {
        Random rand = new Random();
        int[][] data = new int[size][2];

        for (int i = 0; i < size; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(10);        // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employees) {
        int n = employees.length;
        double[][] result = new double[n][4];

        for (int i = 0; i < n; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];

            double bonus = (years > 5) ? (0.05 * oldSalary) : (0.02 * oldSalary);
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }
        return result;
    }

    // Simple printing
    public static void displayResults(double[][] results) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp  OldSalary  Years  Bonus  NewSalary");

        for (int i = 0; i < results.length; i++) {
            totalOld += results[i][0];
            totalBonus += results[i][2];
            totalNew += results[i][3];

            System.out.println((i + 1) + " : " +
                    (int)results[i][0] + " : " +
                    (int)results[i][1] + " : " +
                    (int)results[i][2] + " : " +
                    (int)results[i][3]);
        }

        System.out.println("TOTAL : " + (int)totalOld + " : " + (int)totalBonus + " : " + (int)totalNew);
    }
}
