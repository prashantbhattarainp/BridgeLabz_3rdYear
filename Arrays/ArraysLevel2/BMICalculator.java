import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            while (weight[i] <= 0) {
                System.out.print("Invalid! Enter positive weight: ");
                weight[i] = sc.nextDouble();
            }

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();
            while (height[i] <= 0) {
                System.out.print("Invalid! Enter positive height: ");
                height[i] = sc.nextDouble();
            }

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine status with new condition
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}
