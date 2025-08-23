// Class MultiplicationTable prints the multiplication table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
