import java.util.Scanner;

class DivisionOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Compute quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display result
        System.out.println("The Quotient is " + quotient 
                           + " and Remainder is " + remainder 
                           + " of two numbers " + number1 + " and " + number2);
    }
}
