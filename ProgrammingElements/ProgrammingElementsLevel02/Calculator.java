import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables number1 and number2 to take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations and store results
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The Addition, Subtraction, Multiplication and Division of numbers " 
                           + number1 + " and " + number2 + " are " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", " + division);
    }
}
