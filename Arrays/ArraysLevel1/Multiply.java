import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a number to generate multiplication table (6 to 9): ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        // Calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;  // store in array
        }
        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
