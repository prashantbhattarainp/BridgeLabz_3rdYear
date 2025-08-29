import java.util.Scanner;

public class TeamBMI {

    // Method to calculate BMI and Status
    static String[][] calculateBMI(double[][] hwData) {
        int n = hwData.length;
        String[][] bmiResults = new String[n][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = hwData[i][0];
            double heightCm = hwData[i][1];
            double heightM = heightCm / 100.0; // convert cm to m

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

            // Status based on BMI
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            bmiResults[i][0] = weight + " kg";
            bmiResults[i][1] = heightCm + " cm";
            bmiResults[i][2] = String.valueOf(bmi);
            bmiResults[i][3] = status;
        }
        return bmiResults;
    }

    // Method to display results
    static void displayResults(String[][] results) {
        System.out.println("\nPerson\tWeight\tHeight\t\tBMI\tStatus");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                results[i][3]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // team size fixed
        double[][] hwData = new double[n][2]; // [Weight, Height]

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " - Weight (kg): ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " - Height (cm): ");
            hwData[i][1] = sc.nextDouble();
        }

        String[][] results = calculateBMI(hwData);
        displayResults(results);
    }
}
