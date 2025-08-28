import java.util.Scanner;

public class RunUntilNegative {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of maximum 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or negative number to stop:");

        // Infinite loop
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double value = sc.nextDouble();

            // Stop if 0 or negative number entered
            if (value <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full (10 values max).");
                break;
            }

            // Store value in array and increment index
            numbers[index] = value;
            index++;
        }

        // Display numbers and calculate total
        System.out.print("\nNumbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Print sum
        System.out.println("\nSum of numbers = " + total);
     }
    
}
