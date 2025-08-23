// Class Calculator performs basic arithmetic operations using switch...case
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get first number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        // Get second number
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        // Get operator as a string
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();

        // Perform operation based on the operator using switch-case
        switch (op) {
            case "+":
                System.out.println("Result: " + first + " + " + second + " = " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + first + " - " + second + " = " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + first + " * " + second + " = " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + first + " / " + second + " = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator. Please enter +, -, *, or /.");
        }
    }
}
