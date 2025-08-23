// Importing the Scanner class to read user sc
import java.util.Scanner;

// Creating a class with a name that indicates its purpose
class BMICalculator {

    public static void main(String[] args) {
        // Create a new Scanner object to read from the standard input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their weight and store it
        System.out.print("Enter your weight in kilograms (e.g., 68.5): ");
        double weightInKg = sc.nextDouble();

        // Prompt the user for their height and store it
        System.out.print("Enter your height in centimeters (e.g., 175): ");
        double heightInCm = sc.nextDouble();

        // --- Calculation ---
        // Convert height from centimeters to meters for the BMI formula
        double heightInMeters = heightInCm / 100.0;

        // Calculate the BMI using the formula: weight / (height * height)
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Variable to store the final weight status string
        String weightStatus;

        // --- Determine Weight Status using Conditional Logic ---
        // Check the calculated BMI against the provided ranges
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else { // This covers the case where bmi is >= 40.0
            weightStatus = "Obese";
        }

        // Print the calculated BMI, formatted to two decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Print the determined weight status
        System.out.println("Your weight status is: " + weightStatus);

    }
}
