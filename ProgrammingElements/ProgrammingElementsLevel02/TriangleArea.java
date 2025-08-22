import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height from user
        System.out.print("Enter base of triangle in cm: ");
        double baseInCm = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double heightInCm = input.nextDouble();

        // Compute area in square cm
        double areaSqCm = 0.5 * baseInCm * heightInCm;

        // Convert cm to inch (1 inch = 2.54 cm), so cm^2 to in^2 => divide by (2.54*2.54)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Display result
        System.out.println("The Area of the triangle is " + areaSqIn 
                           + " square inches and " + areaSqCm + " square cm");
    }
}
