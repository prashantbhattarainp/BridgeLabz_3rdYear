import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for one person
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0; // convert cm to meters
        return weight / (heightMeters * heightMeters);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array for weight, height, and BMI
        double[][] team = new double[10][3];
        String[] status = new String[10];

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            team[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            team[i][1] = sc.nextDouble();

            // Calculate BMI and store in array
            team[i][2] = calculateBMI(team[i][0], team[i][1]);

            // Determine BMI status
            status[i] = getBMIStatus(team[i][2]);
        }

        // Display Results (simple colon-separated output)
        System.out.println("\n--- Team BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + team[i][0] +
                               " : Height: " + team[i][1] +
                               " : BMI: " + String.format("%.2f", team[i][2]) +
                               " : Status: " + status[i]);
        }

        sc.close();
    }
}
