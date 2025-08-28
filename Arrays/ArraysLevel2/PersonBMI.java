import java.util.Scanner;

public class PersonBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [i][0]=height, [i][1]=weight, [i][2]=BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            double height, weight;

            while (true) {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Height must be positive. Try again.");
            }

            while (true) {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Weight must be positive. Try again.");
            }

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
