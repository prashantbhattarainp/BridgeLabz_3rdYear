// Class EmployeeBonus calculates bonus for employees based on years of service
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input values for salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus variable
        double bonus = 0.0;

        // Check if employee is eligible for bonus (more than 5 years)
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% bonus
            System.out.println("Employee is eligible for bonus: " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus.");
        }
    }
}
